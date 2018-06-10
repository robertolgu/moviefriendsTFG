package es.udc.moviefriends.model.usuario.service;

import es.udc.moviefriends.model.usuario.Usuario;

public interface UsuarioService {

	public Integer createUsuario(Usuario usuario) throws Exception;
	
	public Usuario updateUsuario(Usuario usuario) throws Exception;
	
	public void removeUsuarioById (Integer idUsuario) throws Exception;
	
	public Usuario findUsuarioById(Integer idUsuario) throws Exception;

	public Usuario findUsuarioByUserName(String name);
	
	
}
