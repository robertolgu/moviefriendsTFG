package es.udc.moviefriends.model.pelicula;

import java.util.List;

public class Pelicula {

	private Integer idPelicula;
	private String titulo;
	private Short anhoEstreno;
	private String sinopsis;
	private String trailerPath;
	private String posterPath;
	private List<GeneroPelicula> generosPelicula;
	private List<Actor> actores;
	private List<Director> directores;
	private List<Guionista> guionistas;
	private Float puntuacionMedia;
	private Integer numeroPuntuaciones;
	private List<Critica> criticas;
	
	public Pelicula(){
	}

	public Pelicula(Integer idPelicula, String titulo, Short anhoEstreno, String sinopsis, String trailerPath,
			String posterPath, List<GeneroPelicula> generosPelicula, List<Actor> actores, List<Director> directores,
			List<Guionista> guionistas, Float puntuacionMedia, Integer numeroPuntuaciones, List<Critica> criticas) {
		super();
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.anhoEstreno = anhoEstreno;
		this.sinopsis = sinopsis;
		this.trailerPath = trailerPath;
		this.posterPath = posterPath;
		this.generosPelicula = generosPelicula;
		this.actores = actores;
		this.directores = directores;
		this.guionistas = guionistas;
		this.puntuacionMedia = puntuacionMedia;
		this.numeroPuntuaciones = numeroPuntuaciones;
		this.criticas = criticas;
	}

	public Integer getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Short getAnhoEstreno() {
		return anhoEstreno;
	}

	public void setAnhoEstreno(Short anhoEstreno) {
		this.anhoEstreno = anhoEstreno;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getTrailerPath() {
		return trailerPath;
	}

	public void setTrailerPath(String trailerPath) {
		this.trailerPath = trailerPath;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}

	public List<GeneroPelicula> getGenerosPelicula() {
		return generosPelicula;
	}

	public void setGenerosPelicula(List<GeneroPelicula> generosPelicula) {
		this.generosPelicula = generosPelicula;
	}

	public List<Actor> getActores() {
		return actores;
	}

	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}

	public List<Director> getDirectores() {
		return directores;
	}

	public void setDirectores(List<Director> directores) {
		this.directores = directores;
	}

	public List<Guionista> getGuionistas() {
		return guionistas;
	}

	public void setGuionistas(List<Guionista> guionistas) {
		this.guionistas = guionistas;
	}

	public Float getPuntuacionMedia() {
		return puntuacionMedia;
	}

	public void setPuntuacionMedia(Float puntuacionMedia) {
		this.puntuacionMedia = puntuacionMedia;
	}

	public Integer getNumeroPuntuaciones() {
		return numeroPuntuaciones;
	}

	public void setNumeroPuntuaciones(Integer numeroPuntuaciones) {
		this.numeroPuntuaciones = numeroPuntuaciones;
	}

	public List<Critica> getCriticas() {
		return criticas;
	}

	public void setCriticas(List<Critica> criticas) {
		this.criticas = criticas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actores == null) ? 0 : actores.hashCode());
		result = prime * result + ((anhoEstreno == null) ? 0 : anhoEstreno.hashCode());
		result = prime * result + ((criticas == null) ? 0 : criticas.hashCode());
		result = prime * result + ((directores == null) ? 0 : directores.hashCode());
		result = prime * result + ((generosPelicula == null) ? 0 : generosPelicula.hashCode());
		result = prime * result + ((guionistas == null) ? 0 : guionistas.hashCode());
		result = prime * result + ((idPelicula == null) ? 0 : idPelicula.hashCode());
		result = prime * result + ((numeroPuntuaciones == null) ? 0 : numeroPuntuaciones.hashCode());
		result = prime * result + ((posterPath == null) ? 0 : posterPath.hashCode());
		result = prime * result + ((puntuacionMedia == null) ? 0 : puntuacionMedia.hashCode());
		result = prime * result + ((sinopsis == null) ? 0 : sinopsis.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + ((trailerPath == null) ? 0 : trailerPath.hashCode());
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
		Pelicula other = (Pelicula) obj;
		if (actores == null) {
			if (other.actores != null)
				return false;
		} else if (!actores.equals(other.actores))
			return false;
		if (anhoEstreno == null) {
			if (other.anhoEstreno != null)
				return false;
		} else if (!anhoEstreno.equals(other.anhoEstreno))
			return false;
		if (criticas == null) {
			if (other.criticas != null)
				return false;
		} else if (!criticas.equals(other.criticas))
			return false;
		if (directores == null) {
			if (other.directores != null)
				return false;
		} else if (!directores.equals(other.directores))
			return false;
		if (generosPelicula == null) {
			if (other.generosPelicula != null)
				return false;
		} else if (!generosPelicula.equals(other.generosPelicula))
			return false;
		if (guionistas == null) {
			if (other.guionistas != null)
				return false;
		} else if (!guionistas.equals(other.guionistas))
			return false;
		if (idPelicula == null) {
			if (other.idPelicula != null)
				return false;
		} else if (!idPelicula.equals(other.idPelicula))
			return false;
		if (numeroPuntuaciones == null) {
			if (other.numeroPuntuaciones != null)
				return false;
		} else if (!numeroPuntuaciones.equals(other.numeroPuntuaciones))
			return false;
		if (posterPath == null) {
			if (other.posterPath != null)
				return false;
		} else if (!posterPath.equals(other.posterPath))
			return false;
		if (puntuacionMedia == null) {
			if (other.puntuacionMedia != null)
				return false;
		} else if (!puntuacionMedia.equals(other.puntuacionMedia))
			return false;
		if (sinopsis == null) {
			if (other.sinopsis != null)
				return false;
		} else if (!sinopsis.equals(other.sinopsis))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (trailerPath == null) {
			if (other.trailerPath != null)
				return false;
		} else if (!trailerPath.equals(other.trailerPath))
			return false;
		return true;
	}
	
}
