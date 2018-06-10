package es.udc.moviefriends.model.pelicula;

import java.util.List;

public class Director {
	
	private Integer idDirector;
	private String nombre;
	private List<Pelicula> peliculasDirector;
	
	public Director(){
	}


	public Director(Integer idDirector, String nombre, List<Pelicula> peliculasDirector) {
		super();
		this.idDirector = idDirector;
		this.nombre = nombre;
		this.peliculasDirector = peliculasDirector;
	}


	public Integer getIdDirector() {
		return idDirector;
	}


	public void setIdDirector(Integer idDirector) {
		this.idDirector = idDirector;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idDirector == null) ? 0 : idDirector.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((peliculasDirector == null) ? 0 : peliculasDirector.hashCode());
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
		Director other = (Director) obj;
		if (idDirector == null) {
			if (other.idDirector != null)
				return false;
		} else if (!idDirector.equals(other.idDirector))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (peliculasDirector == null) {
			if (other.peliculasDirector != null)
				return false;
		} else if (!peliculasDirector.equals(other.peliculasDirector))
			return false;
		return true;
	}


	public List<Pelicula> getPeliculasDirector() {
		return peliculasDirector;
	}


	public void setPeliculasDirector(List<Pelicula> peliculasDirector) {
		this.peliculasDirector = peliculasDirector;
	}
	
}
