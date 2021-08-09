package com.frazao.recepcao.modelo.dominio.recepcao;

public enum UsuarioPerfil {

	ADMIN("Admin"), CLIENTE("Cliente"), PARCEIRO("Parceiro");

	private String descricao;

	private UsuarioPerfil(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

}