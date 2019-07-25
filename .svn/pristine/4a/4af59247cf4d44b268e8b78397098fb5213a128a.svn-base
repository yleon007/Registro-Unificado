package com.ericsson.alodiga.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "perfilAloRRP")
@NamedQuery(name = "PerfilAloRRP.findAll", query = "SELECT p FROM PerfilAloRRP p")
public class PerfilAloRRP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usuarioAloRRPId;

	private int distribuidorPadreId;

	private int empresaId;

	private boolean isAffiliatedKit;

	public PerfilAloRRP() {
	}

	public int getUsuarioAloRRPId() {
		return this.usuarioAloRRPId;
	}

	public void setUsuarioAloRRPId(int usuarioAloRRPId) {
		this.usuarioAloRRPId = usuarioAloRRPId;
	}

	public int getDistribuidorPadreId() {
		return this.distribuidorPadreId;
	}

	public void setDistribuidorPadreId(int distribuidorPadreId) {
		this.distribuidorPadreId = distribuidorPadreId;
	}

	public int getEmpresaId() {
		return this.empresaId;
	}

	public void setEmpresaId(int empresaId) {
		this.empresaId = empresaId;
	}

	public boolean getIsAffiliatedKit() {
		return this.isAffiliatedKit;
	}

	public void setIsAffiliatedKit(boolean isAffiliatedKit) {
		this.isAffiliatedKit = isAffiliatedKit;
	}

}