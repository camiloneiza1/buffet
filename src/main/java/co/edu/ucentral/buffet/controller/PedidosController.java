package co.edu.ucentral.buffet.controller;

import java.security.Principal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.edu.ucentral.buffet.model.DetPedidos;
import co.edu.ucentral.buffet.model.DetPedidosHasComidas;
import co.edu.ucentral.buffet.model.Pedidos;
import co.edu.ucentral.buffet.model.Usuarios;
import co.edu.ucentral.buffet.service.DetPedidosHasComidasService;
import co.edu.ucentral.buffet.service.DetPedidosService;
import co.edu.ucentral.buffet.service.PedidosService;
import co.edu.ucentral.buffet.service.UsuariosService;


@Controller
@RequestMapping("/pedidos")
public class PedidosController {
	@Autowired
	private PedidosService pedidosService;
	
	@Autowired
	private DetPedidosService detPedidosService;
	
	@Autowired
	private DetPedidosHasComidasService detPedidosHasComidasService;
	
	@Autowired
	private UsuariosService usuariosService;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	private String index(Pageable page, Model model) {
		Page<Pedidos> lista = pedidosService.paginarPedidos(page);
		model.addAttribute("list_pedidos", lista);
		return "pedidos/listFacturacion";
	}

	@RequestMapping(value="/factura/{id}", method=RequestMethod.GET)
	public String mostrar(@PathVariable("id") int idPedidos, Model model) {
		Pedidos pedido = pedidosService.buscarPorId(idPedidos);
		model.addAttribute("pedido", pedido);
		return "pedidos/facturacion";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	private String crear(Model model, HttpServletRequest request, RedirectAttributes attributes, Principal principal) {
		CarritoController carrcll = new CarritoController();
		List<DetPedidos> detpedido = carrcll.obtenerCarrito(request);
		
		Usuarios usuario = usuariosService.buscarPorUserName(principal.getName());
		
		Pedidos pedido = new Pedidos();
		
		pedido.setEstado("Recibido");
		pedido.setFechaEntrega(new Date());
		pedido.setFechaSolicitud(new Date());
		pedido.setValorDomicilio(2000);
		pedido.setdPedidos(detpedido);
		pedido.setUsuarios(usuario);
		pedido.setTelefono(usuario.getTelefono());
		pedido.setDireccion(usuario.getDireccion());
		pedido.setFormaPago("Efectivo");
		
		Pedidos pedidoDB = pedidosService.guardar(pedido);
		
		double tot_platos = 0;
		for (DetPedidos detPedidos : detpedido) {
			detPedidos.setPedidos(pedidoDB);
			DetPedidos detPedidoDB = detPedidosService.guardar(detPedidos);
			for (DetPedidosHasComidas detPedidosHasComidas : detPedidos.getDPedidosHasComidas()) {
				detPedidosHasComidas.setDPedidos(detPedidoDB);;
				detPedidosHasComidasService.guardar(detPedidosHasComidas);
			}
			tot_platos += detPedidos.getMenu().getPrecio() * detPedidos.getCantidad();
		}
		
		pedidoDB.setValorPlatos(tot_platos);
		pedidoDB.setValorTotal(tot_platos + 2000);
		
		pedidosService.guardar(pedidoDB);
		
		carrcll.limpiarCarrito(request, attributes);
		
		attributes.addAttribute("msg", "Su pedido fue agregado");
		return "redirect:/pedidos/index";
	}
}
