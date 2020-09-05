package co.edu.ucentral.buffet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.edu.ucentral.buffet.model.Menus;
import co.edu.ucentral.buffet.service.MenusService;

@Controller
@RequestMapping("/menus")
public class MenuController {

	@Autowired
	private MenusService menuService;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	private String index(Pageable page, Model model) {
		Page<Menus> lista = menuService.paginarMenus(page);
		model.addAttribute("list_menus", lista);
		return "menus/MenusIndex";
	}
	
}
