package es.udc.moviefriends.model.pelicula;

import es.udc.moviefriends.model.usuario.Usuario;

public class Critica {

	private Integer idCritica;
	private Usuario usuario;
	private Pelicula pelicula;
	private Integer puntuacion;
	private String texto;
	
	public Critica(){
	}

	public Critica(Integer idCritica, Usuario usuario, Pelicula pelicula, Integer puntuacion, String texto) {
		super();
		this.idCritica = idCritica;
		this.usuario = usuario;
		this.pelicula = pelicula;
		this.puntuacion = puntuacion;
		this.texto = texto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Integer getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCritica == null) ? 0 : idCritica.hashCode());
		result = prime * result + ((pelicula == null) ? 0 : pelicula.hashCode());
		result = prime * result + ((puntuacion == null) ? 0 : puntuacion.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Critica other = (Critica) obj;
		if (idCritica == null) {
			if (other.idCritica != null)
				return false;
		} else if (!idCritica.equals(other.idCritica))
			return false;
		if (pelicula == null) {
			if (other.pelicula != null)
				return false;
		} else if (!pelicula.equals(other.pelicula))
			return false;
		if (puntuacion == null) {
			if (other.puntuacion != null)
				return false;
		} else if (!puntuacion.equals(other.puntuacion))
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	public Integer getIdCritica() {
		return idCritica;
	}

	public void setIdCritica(Integer idCritica) {
		this.idCritica = idCritica;
	}

}
