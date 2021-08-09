package com.frazao.recepcao.modelo.entidade.recepcao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.frazao.recepcao.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Visitante")
@Table(schema = "recepcao", name = "visitante")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Visitante extends EntidadeBaseTemId<Pessoa> {

	private static final long serialVersionUID = 1L;

	@Column(name = "e_mail")
	private String eMail;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "entidade_representante_id")
	private Visitante entidadeRepresentanteId;

	@Column(name = "foto")
	@Lob
	private byte[] foto;

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id")
	@Id
	private Pessoa id;

	@Column(name = "telefone")
	private String telefone;

	@Transient
	private List<VisitaVisitante> visitaVisitanteList;

}
