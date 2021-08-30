package com.frazao.recepcao.modelo.entidade.recepcao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Visitante")
@Table(name = "visitante")
@PrimaryKeyJoinColumn(name = "id")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Visitante extends Pessoa {

	private static final long serialVersionUID = 1L;

	@Column(name = "e_mail")
	private String eMail;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "entidade_representante_id")
	private EntidadeRepresentante entidadeRepresentanteId;

	@Column(name = "foto")
	@Lob
	private byte[] foto;

	@Column(name = "telefone")
	private String telefone;

	@Transient
	private List<VisitaVisitante> visitaVisitanteList;

}
