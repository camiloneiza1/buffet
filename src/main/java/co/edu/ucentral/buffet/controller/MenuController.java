package co.edu.ucentral.buffet.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.edu.ucentral.buffet.model.Comidas;
import co.edu.ucentral.buffet.model.DetMenus;
import co.edu.ucentral.buffet.model.Menus;
import co.edu.ucentral.buffet.service.ComidasService;
import co.edu.ucentral.buffet.service.DetMenusService;
import co.edu.ucentral.buffet.service.MenusService;

@Controller
@RequestMapping("/menus")
public class MenuController {

	@Autowired
	private MenusService menuService;
	@Autowired
	private DetMenusService detMenuService;
	@Autowired
	private ComidasService comidaService;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	private String index(Pageable page, Model model) {
		Page<Menus> lista = menuService.paginarMenus(page);
		model.addAttribute("list_menus", lista);
		return "menus/MenusIndex";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String crear(Model model, Menus menu) {
		return "menus/formMenus";
	}
	
	@RequestMapping(value="/detmenus/create/{idMenu}", method=RequestMethod.GET)
	public String crearDet(Model model, @PathVariable("idMenu") int idMenu, DetMenus detMenu) {
		Menus menu = menuService.buscarPorId(idMenu);
		List<Comidas> comidas = comidaService.listarComidas();
		model.addAttribute("comidas", comidas);
		detMenu.setMenus(menu);
		return "menus/formDetMenus";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String guardar(Menus menu, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return "menus/formMenus";
		}
		menuService.guardar(menu);
		System.out.println("Menu: " + menu);
		attributes.addFlashAttribute("msg", "Registro guardo");
		return "redirect:/menus/index";
	}
	
	@RequestMapping(value="/detmenus/save", method=RequestMethod.POST)
	public String guardarDet(DetMenus detMenu, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return "menus/formDetMenus";
		}
		System.out.println(detMenu);	
		detMenuService.guardar(detMenu);
		attributes.addFlashAttribute("msg", "Registro guardo");
		attributes.addAttribute("id", detMenu.getMenus().getIdMenus());
		return "redirect:/menus/view/{id}";
	}
	
	@RequestMapping(value="/detmenus/view/{idDet}", method=RequestMethod.GET)
	public String mostrarDet(@PathVariable("idDet") int idDet, Model model) {
		DetMenus detMenu = detMenuService.buscarPorId(idDet);
		Menus menu = detMenu.getMenus();
		List<Comidas> comidas = comidaService.listarComidas();
		
		model.addAttribute("comidas", comidas);
		model.addAttribute("menu", menu);
		model.addAttribute("detMenus", detMenu);
		return "menus/formDetMenus";
	}
	
	@RequestMapping(value="/view/{id}", method=RequestMethod.GET)
	public String mostrar(@PathVariable("id") int idMenu, Model model) {
		Menus menu = menuService.buscarPorId(idMenu);
		model.addAttribute("menu", menu);
		return "menus/formMenus";
	}
	
	@RequestMapping(value="/detmenus/delete/{id}", method=RequestMethod.GET)
	public String borrarDet(@PathVariable("id") int idDet, RedirectAttributes attributes) {
		DetMenus detMenu = detMenuService.buscarPorId(idDet);
		detMenuService.borrar(idDet);
		attributes.addAttribute("id", detMenu.getMenus().getIdMenus());
		return "redirect:/menus/view/{id}";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String borrar(@PathVariable("id") int idMenu) {
		menuService.borrar(idMenu);
		return "redirect:/menus/index";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(format,false));
	}

	
}
