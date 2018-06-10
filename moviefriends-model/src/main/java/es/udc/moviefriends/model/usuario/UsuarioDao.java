package es.udc.moviefriends.model.usuario;

public interface UsuarioDao {

	
	public Integer createUsuario(Usuario usuario) throws Exception;
	
	public Usuario updateUsuario(Usuario usuario) throws Exception;
	
	public void removeUsuario (Usuario Usuario) throws Exception;
	
	public Usuario findUsuarioById(Integer idUsuario) throws Exception;
	
}
