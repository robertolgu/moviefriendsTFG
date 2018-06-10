package es.udc.moviefriends.model.pelicula.dao;

import es.udc.moviefriends.model.pelicula.Pelicula;

public interface PeliculaDao {

	
	public Integer createPelicula(Pelicula pelicula);
	
	public Pelicula updatePelicula(Pelicula pelicula);
	
	public void removePelicula(Pelicula pelicula);
	
	public Pelicula findPeliculaById(Integer idPelicula);
	
}
