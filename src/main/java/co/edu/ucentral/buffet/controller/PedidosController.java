package co.edu.ucentral.buffet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
