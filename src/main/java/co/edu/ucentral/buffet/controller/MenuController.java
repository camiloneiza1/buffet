package co.edu.ucentral.buffet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.edu.ucentral.buffet.service.MenusService;

@Controller
@RequestMapping("/menus")
public class MenuController {

	@Autowired
	private MenusService menuService;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	private String index(Model model) {
		model.addAttribute("list_menus", menuService.listarMenus());
		return "menus/index";
	}
	
}
