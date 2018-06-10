package es.udc.moviefriends.model.usuario;

public class TipoUsuario {
	
	private Integer idTipoUsuario;
	private String descTipoUsuario;
	
	public TipoUsuario(){
	}

	public Integer getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(Integer idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public String getDescTipoUsuario() {
		return descTipoUsuario;
	}

	public void setDescTipoUsuario(String descTipoUsuario) {
		this.descTipoUsuario = descTipoUsuario;
	}

	@Override
	public String toString() {
		return "TipoUsuario [idTipoUsuario=" + idTipoUsuario + ", descTipoUsuario=" + descTipoUsuario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipoUsuario == null) ? 0 : idTipoUsuario.hashCode());
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
		TipoUsuario other = (TipoUsuario) obj;
		if (idTipoUsuario == null) {
			if (other.idTipoUsuario != null)
				return false;
		} else if (!idTipoUsuario.equals(other.idTipoUsuario))
			return false;
		return true;
	}
	
	

}
