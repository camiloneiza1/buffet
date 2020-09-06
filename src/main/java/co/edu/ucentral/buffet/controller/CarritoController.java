package co.edu.ucentral.buffet.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.edu.ucentral.buffet.model.DetPedidos;
import co.edu.ucentral.buffet.model.DetPedidosHasComidas;
import co.edu.ucentral.buffet.model.Menus;
import co.edu.ucentral.buffet.service.MenusService;

@Controller
@RequestMapping("/carrito")
public class CarritoController {

	@Autowired
	private MenusService menuService;
	
	private List<DetPedidos> detPedidos = null;
	
	private Menus menuTemp = null;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String mostrarCarrito(Model model, HttpServletRequest request) {
		List<DetPedidos> pedido = this.obtenerCarrito(request);
		return "index";
	}
	
	@RequestMapping(value="/addDetPedido", method=RequestMethod.POST)
	public String addMenuCarrito(Model model, HttpServletRequest request, RedirectAttributes attributes, DetPedidosHasComidas detPedidosHasComidas) {
		
		System.out.println(detPedidosHasComidas.toString());
		detPedidos = this.obtenerCarrito(request);
		menuTemp = this.obtenerMenu(request);
		
		if (menuTemp.getIdMenus() != null) {
			if (detPedidos != null) {
				menuTemp.setDMenus(null);
		    	DetPedidos detped = new DetPedidos();
		    	detped.setCantidad(1);
		    	detped.setMenus(menuTemp);
		    	detped.setPedidos(null);
		    	detPedidos.add(detped);
			}else {
				detPedidos = new LinkedList<DetPedidos>();
			}
		}
		 this.guardarCarrito(detPedidos, request);
		 attributes.addAttribute("idMenu", menuTemp.getIdMenus());
		 return "redirect:/carrito/selectComida/{idMenu}";
	}
	
	@RequestMapping(value="/selectComida/{idMenu}", method=RequestMethod.GET)
	public String mostrarSeleccionarComidas(@PathVariable("idMenu") int idMenu, Model model, HttpServletRequest request) {
		Menus menu = menuService.buscarPorId(idMenu);
		model.addAttribute("menu",menu);
		return "carrito/seleccionarComidas";
	}
	
	private List<DetPedidos> obtenerCarrito(HttpServletRequest request) {
	    List<DetPedidos> carrito = (List<DetPedidos>) request.getSession().getAttribute("detPedido");
	    return carrito;
	}
	
	@RequestMapping(value="/addMenu/{id}", method=RequestMethod.GET)
	public String guardarMenu(@PathVariable("id") int idMenu, Model model, HttpServletRequest request, RedirectAttributes attributes) {
		Menus menu = menuService.buscarPorId(idMenu);
		menuTemp = this.obtenerMenu(request);
		if (menuTemp != null) {
			request.getSession().removeAttribute("menuCrr");
		}
	    request.getSession().setAttribute("menuCrr", menu);
	    attributes.addAttribute("idMenu", menu.getIdMenus());
		return "redirect:/carrito/selectComida/{idMenu}";
	}
	
	private Menus obtenerMenu(HttpServletRequest request) {
	    Menus menu = (Menus) request.getSession().getAttribute("menuCrr");
	    return menu;
	}
	
	private void guardarCarrito(List<DetPedidos> detPedido, HttpServletRequest request) {
	    request.getSession().setAttribute("detPedido", detPedido);
	}
	
	
}
