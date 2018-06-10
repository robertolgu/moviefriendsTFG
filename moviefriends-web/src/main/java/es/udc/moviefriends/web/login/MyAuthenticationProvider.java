package es.udc.moviefriends.web.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import es.udc.moviefriends.model.usuario.Usuario;
import es.udc.moviefriends.model.usuario.service.UsuarioService;


@Component("myAuthenticationProvider")
public class MyAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private UsuarioService usuarioService;
	
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public Authentication authenticate(Authentication auth) throws AuthenticationException {
		Usuario user = this.usuarioService.findUsuarioByUserName(auth.getName());
		
		if ((user != null) && (auth.getCredentials().toString().equals(user.getPassword()))){
//			return new UsernamePasswordAuthenticationToken(user,);
		}
		
		
		return null;
	}

	public boolean supports(Class<? extends Object> arg0) {
		// TODO Auto-generated method stub
		return false;
	}


}
