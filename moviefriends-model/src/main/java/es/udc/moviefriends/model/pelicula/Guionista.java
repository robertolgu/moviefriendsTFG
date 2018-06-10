package es.udc.moviefriends.model.pelicula;

import java.util.List;

public class Guionista {

	private Integer idGuionista;
	private String nombre;
	private List<Pelicula> peliculasGuionista;
	
	public Guionista(){
	}

	public Guionista(Integer idGuionista, String nombre, List<Pelicula> peliculasGuionista) {
		super();
		this.idGuionista = idGuionista;
		this.nombre = nombre;
		this.peliculasGuionista = peliculasGuionista;
	}

	public Integer getIdGuionista() {
		return idGuionista;
	}

	public void setIdGuionista(Integer idGuionista) {
		this.idGuionista = idGuionista;
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
		result = prime * result + ((idGuionista == null) ? 0 : idGuionista.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((peliculasGuionista == null) ? 0 : peliculasGuionista.hashCode());
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
		Guionista other = (Guionista) obj;
		if (idGuionista == null) {
			if (other.idGuionista != null)
				return false;
		} else if (!idGuionista.equals(other.idGuionista))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (peliculasGuionista == null) {
			if (other.peliculasGuionista != null)
				return false;
		} else if (!peliculasGuionista.equals(other.peliculasGuionista))
			return false;
		return true;
	}

	public List<Pelicula> getPeliculasGuinista() {
		return peliculasGuionista;
	}

	public void setPeliculasGuinista(List<Pelicula> peliculasGuionista) {
		this.peliculasGuionista = peliculasGuionista;
	}
	
}
