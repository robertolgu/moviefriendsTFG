package es.udc.moviefriends.model.usuario.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import es.udc.moviefriends.model.usuario.Usuario;

@Repository("usuarioDao")
public class UsuarioDaoHibernate implements UsuarioDao{

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public Integer createUsuario(Usuario usuario) throws Exception {
		hibernateTemplate.save(usuario);
		return usuario.getIdUsuario();
	}

	public Usuario updateUsuario(Usuario usuario) throws Exception {
		hibernateTemplate.update(usuario);
		return usuario;
	}

	public void removeUsuario(Usuario usuario) throws Exception{
		hibernateTemplate.delete(usuario);
	}

	public Usuario findUsuarioById(Integer idUsuario) throws Exception {

		final Usuario usuario = new Usuario();
		
		usuario.setIdUsuario(idUsuario);
		
		return (Usuario) hibernateTemplate.findByExample(usuario);
	}

}
