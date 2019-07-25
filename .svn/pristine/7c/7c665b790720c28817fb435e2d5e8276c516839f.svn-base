package com.ericsson.alodiga.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tarjetaUsuario database table.
 * 
 */
@Embeddable
public class TarjetaUsuarioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="tarjeta_id", insertable=false, updatable=false)
	private int tarjetaId;

	@Column(insertable=false, updatable=false)
	private int usuarioId;

	public TarjetaUsuarioPK() {
	}
	public int getTarjetaId() {
		return this.tarjetaId;
	}
	public void setTarjetaId(int tarjetaId) {
		this.tarjetaId = tarjetaId;
	}
	public int getUsuarioId() {
		return this.usuarioId;
	}
	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TarjetaUsuarioPK)) {
			return false;
		}
		TarjetaUsuarioPK castOther = (TarjetaUsuarioPK)other;
		return 
			(this.tarjetaId == castOther.tarjetaId)
			&& (this.usuarioId == castOther.usuarioId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tarjetaId;
		hash = hash * prime + this.usuarioId;
		
		return hash;
	}
}