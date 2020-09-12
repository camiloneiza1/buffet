package co.edu.ucentral.buffet.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.edu.ucentral.buffet.model.DetPedidos;
import co.edu.ucentral.buffet.model.Pedidos;
import co.edu.ucentral.buffet.service.PedidosService;


@Controller
@RequestMapping("/pedidos")
public class PedidosController {
	@Autowired
	private PedidosService pedidosService;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	private String index(Pageable page, Model model) {
		Page<Pedidos> lista = pedidosService.paginarPedidos(page);
		model.addAttribute("list_pedidos", lista);
		return "pedidos/facturacion";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	private String crear(Model model, HttpServletRequest request) {
		CarritoController carrcll = new CarritoController();
		List<DetPedidos> detpedido = carrcll.obtenerCarrito(request);
				
		Pedidos pedido = new Pedidos();
		
		pedido.setEstado("Recibido");
		pedido.setFechaEntrega(new Date());
		pedido.setFechaSolicitud(new Date());
		pedido.setValorDomicilio(2000);
		pedido.setdPedidos(detpedido);
		
		pedidosService.guardar(pedido);
		
		return "pedidos/facturacion";
	}
}
