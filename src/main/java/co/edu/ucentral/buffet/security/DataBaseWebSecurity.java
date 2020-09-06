package co.edu.ucentral.buffet.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class DataBaseWebSecurity extends WebSecurityConfigurerAdapter{
	@Autowired
	private DataSource dataSourse;
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSourse).usersByUsernameQuery("SELECT username, password, estatus FROM"
				+ " Usuarios where username = ?")
		.authoritiesByUsernameQuery("SELECT u.username, p.perfil FROM UsuarioPerfil up "
				+ "INNER JOIN Usuarios u ON u.idUsuarios = up.idUsuario "
				+ "INNER JOIN Perfiles p ON p.idPerfiles = up.idPerfil where u.username = ? ");
	}
	
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers(
				"/js/**",
				"/css/**",
				"/fonts/**",
				"/images/**",
				"/tinymce/**",
				"/carrito/**").permitAll()
		.antMatchers("/menus/**").hasAnyAuthority("ADMINISTRADOR")
		.antMatchers(
				"/",
				"/search/**").permitAll()
		.anyRequest().authenticated()
		.and().formLogin().permitAll();
	}
}
