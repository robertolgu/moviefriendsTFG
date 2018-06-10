package es.udc.moviefriends.model.pelicula.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import es.udc.moviefriends.model.pelicula.Pelicula;

@Repository("peliculaDao")
public class PeliculaDaoHibernate implements PeliculaDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	
	public Integer createPelicula(Pelicula pelicula) {
		hibernateTemplate.save(pelicula);
		return pelicula.getIdPelicula();
	}

	public Pelicula updatePelicula(Pelicula pelicula) {
		hibernateTemplate.update(pelicula);
		return pelicula;
	}

	public void removePelicula(Pelicula pelicula) {
		hibernateTemplate.delete(pelicula);
	}

	public Pelicula findPeliculaById(Integer idPelicula) {
		final Pelicula pelicula = new Pelicula();
		
		pelicula.setIdPelicula(idPelicula);

		return (Pelicula) hibernateTemplate.findByExample(pelicula);
	}

}
