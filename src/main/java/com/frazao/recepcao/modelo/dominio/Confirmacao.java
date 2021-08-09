package com.frazao.recepcao.modelo.dominio;

public enum Confirmacao {

	N("N"), S("S");

	private String descricao;

	private Confirmacao(String descricao) {
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