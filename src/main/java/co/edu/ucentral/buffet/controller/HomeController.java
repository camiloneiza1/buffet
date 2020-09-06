package co.edu.ucentral.buffet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import co.edu.ucentral.buffet.model.Menus;
import co.edu.ucentral.buffet.service.MenusService;

@Controller
public class HomeController {
	@Autowired
	private MenusService menuService;
	
	
	@GetMapping("/")
	public String mostrarHome(Model model) {
		List<Menus> lista = menuService.listarMenus();
		model.addAttribute("list_menus", lista);
		return "index";
	}
	
	
}
