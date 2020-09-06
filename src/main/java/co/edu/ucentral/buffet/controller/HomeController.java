package co.edu.ucentral.buffet.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.edu.ucentral.buffet.model.Usuarios;
import co.edu.ucentral.buffet.model.Perfiles;
import co.edu.ucentral.buffet.service.UsuariosService;

@Controller
public class HomeController {
	
	@Autowired
	private UsuariosService usuariosService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/index")
	public String mostrarIndex(Authentication auth, HttpSession session) {
		String userName = auth.getName();
		System.out.println("usuario: " + userName);
		for(GrantedAuthority rol: auth.getAuthorities()){
			System.out.println("Rol: "+ rol.getAuthority());
		}
		
		if(session.getAttribute("usuario") == null) {
			Usuarios usuario = usuariosService.buscarPorUserName(userName);
			usuario.setPassword(null);
			System.out.println("Usuario: " + usuario);
			session.setAttribute("usuario", usuario);
		}
		return "redirect:/";
	}
	
	@GetMapping("/")
	public String mostrarHome(Model model) {
		model.addAttribute("mensaje", "Bienvenido a Bolsa de Empleo");
		model.addAttribute("fecha", new Date());
		return "index";
	}
	
	@GetMapping("/signup")
	public String registrarse(Usuarios usuarios) {
		return "formRegistro";
	}
	
	@PostMapping("/signup")
	public String guardarRegistro(Usuarios usuarios) {
		String pwdPlano = usuarios.getPassword();
		String pwdEncrip = passwordEncoder.encode(pwdPlano);
		usuarios.setPassword(pwdEncrip);
		usuarios.setEstatus(1);
		Perfiles perfiles = new Perfiles();
		perfiles.setIdPerfiles(2);
		usuarios.agregarPerfil(perfiles);
		usuariosService.guardar(usuarios);
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String mostrarLogin() {
		return "formLogin";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();
		logoutHandler.logout(request, null, null);
		return "redirect:/login";
	}
	
	@GetMapping("/bcrypt/{texto}")
	@ResponseBody
	public String encriptar(@PathVariable("texto") String texto) {
		return texto+ " -> " +  passwordEncoder.encode(texto);
	}
}
