package co.edu.ucentral.buffet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.edu.ucentral.buffet.model.Comidas;
import co.edu.ucentral.buffet.service.ComidasService;

@Controller
@RequestMapping("/comidas")
public class ComidasController {
	
	@Autowired
	private ComidasService comidasService;
	
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	private String index(Pageable page, Model model) {
		Page<Comidas> lista = comidasService.paginarComida(page);
		model.addAttribute("list_comidas", lista);
		return "comidas/ComidasIndex";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String crear(Model model, Comidas comida) {
		model.addAttribute("comida", comida);
		return "comidas/formComidas";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String guardar(Comidas comida, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return "comidas/formComidas";
		}
		comidasService.guardar(comida);
		System.out.println("Comida: " + comida);
		attributes.addFlashAttribute("msg", "Registro guardado");
		return "redirect:/comidas/index";
	}
	
	@RequestMapping(value="/view/{id}", method=RequestMethod.GET)
	public String mostrar(@PathVariable("id") int idComidas, Model model) {
		Comidas comida = comidasService.buscarPorId(idComidas);
		model.addAttribute("comida", comida);
		return "comidas/formComidas";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String borrar(@PathVariable("id") int idComidas) {
		comidasService.borrar(idComidas);
		return "redirect:/menus/index";
	}
}
