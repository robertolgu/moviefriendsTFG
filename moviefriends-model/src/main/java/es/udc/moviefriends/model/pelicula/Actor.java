package es.udc.moviefriends.model.pelicula;

import java.util.List;

public class Actor {

	private Integer idActor;
	private String nombre;
	private List<Pelicula> peliculasActor;
	
	public Actor(){
	}

	public Actor(Integer idActor, String nombre, List<Pelicula> peliculasActor) {
		super();
		this.idActor = idActor;
		this.nombre = nombre;
		this.peliculasActor = peliculasActor;
	}

	public Integer getIdActor() {
		return idActor;
	}

	public void setIdActor(Integer idActor) {
		this.idActor = idActor;
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
		result = prime * result + ((idActor == null) ? 0 : idActor.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((peliculasActor == null) ? 0 : peliculasActor.hashCode());
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
		Actor other = (Actor) obj;
		if (idActor == null) {
			if (other.idActor != null)
				return false;
		} else if (!idActor.equals(other.idActor))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (peliculasActor == null) {
			if (other.peliculasActor != null)
				return false;
		} else if (!peliculasActor.equals(other.peliculasActor))
			return false;
		return true;
	}

	public List<Pelicula> getPeliculasActor() {
		return peliculasActor;
	}

	public void setPeliculasActor(List<Pelicula> peliculasActor) {
		this.peliculasActor = peliculasActor;
	}

	
}
