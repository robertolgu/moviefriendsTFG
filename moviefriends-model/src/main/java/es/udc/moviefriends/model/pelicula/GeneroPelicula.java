package es.udc.moviefriends.model.pelicula;

import java.util.List;

public class GeneroPelicula {
	
	private Integer idGeneroPelicula;
	private String nombreGenero;
	private List<Pelicula> peliculasGenero;
	
	public GeneroPelicula(){
	}
	
	public GeneroPelicula(Integer idGeneroPelicula, String nombreGenero,  List<Pelicula> peliculasGenero) {
		super();
		this.idGeneroPelicula = idGeneroPelicula;
		this.nombreGenero = nombreGenero;
		this.peliculasGenero = peliculasGenero;
	}

	public Integer getIdGeneroPelicula() {
		return idGeneroPelicula;
	}

	public void setIdGeneroPelicula(Integer idGeneroPelicula) {
		this.idGeneroPelicula = idGeneroPelicula;
	}

	public String getNombreGenero() {
		return nombreGenero;
	}

	public void setNombreGenero(String nombreGenero) {
		this.nombreGenero = nombreGenero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idGeneroPelicula == null) ? 0 : idGeneroPelicula.hashCode());
		result = prime * result + ((nombreGenero == null) ? 0 : nombreGenero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeneroPelicula other = (GeneroPelicula) obj;
		if (idGeneroPelicula == null) {
			if (other.idGeneroPelicula != null)
				return false;
		} else if (!idGeneroPelicula.equals(other.idGeneroPelicula))
			return false;
		if (nombreGenero == null) {
			if (other.nombreGenero != null)
				return false;
		} else if (!nombreGenero.equals(other.nombreGenero))
			return false;
		return true;
	}

	public List<Pelicula> getPeliculasGenero() {
		return peliculasGenero;
	}

	public void setPeliculasGenero(List<Pelicula> peliculasGenero) {
		this.peliculasGenero = peliculasGenero;
	}
	
}
