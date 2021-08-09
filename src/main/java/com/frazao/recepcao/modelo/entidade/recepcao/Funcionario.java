package com.frazao.recepcao.modelo.entidade.recepcao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.frazao.recepcao.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Funcionario")
@Table(schema = "recepcao", name = "funcionario")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Funcionario extends EntidadeBaseTemId<Pessoa> {

	private static final long serialVersionUID = 1L;

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id")
	@Id
	private Pessoa id;

	@Transient
	private List<Lotacao> lotacaoList;

	@Column(name = "matricula")
	private String matricula;

	@Column(name = "ramal")
	private String ramal;

	@Transient
	private List<Visita> visitaList;

}
