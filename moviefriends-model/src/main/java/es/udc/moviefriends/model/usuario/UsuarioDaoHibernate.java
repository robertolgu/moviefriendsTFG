package es.udc.moviefriends.model.usuario;


import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

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
		// Se recupera la query (Usuario.hbm.xml)
		Query query = hibernateTemplate.getSessionFactory().getCurrentSession().getNamedQuery("findUsuarioById");
		// Se rellenan los parametros
		query.setParameter("idUsuario", idUsuario);
		// Se pasa la query a un String
		String queryString = query.toString();
		
		
		return (Usuario) hibernateTemplate.find(queryString);
	}

}
