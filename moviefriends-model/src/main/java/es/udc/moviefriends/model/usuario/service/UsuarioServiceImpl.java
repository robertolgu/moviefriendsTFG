package es.udc.moviefriends.model.usuario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.udc.moviefriends.model.usuario.Usuario;
import es.udc.moviefriends.model.usuario.UsuarioDao;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;

	public Integer createUsuario(Usuario usuario) throws Exception {
		return usuarioDao.createUsuario(usuario);
	}

	public Usuario updateUsuario(Usuario usuario) throws Exception {
		return usuarioDao.updateUsuario(usuario);
	}

	public void removeUsuarioById(Integer idUsuario) throws Exception {
		Usuario u = new Usuario();
		u.setIdUsuario(idUsuario);
		
		usuarioDao.removeUsuario(u);
	}

	public Usuario findUsuarioById(Integer idUsuario) throws Exception {
		return usuarioDao.findUsuarioById(idUsuario);
	}

	public Usuario findUsuarioByUserName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
