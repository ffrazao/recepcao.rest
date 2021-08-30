package com.frazao.recepcao.modelo.entidade.recepcao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Funcionario")
@Table(name = "funcionario")
@PrimaryKeyJoinColumn(name = "id")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Funcionario extends Pessoa {

	private static final long serialVersionUID = 1L;

	@Transient
	private List<Lotacao> lotacaoList;

	@Column(name = "matricula")
	private String matricula;

	@Column(name = "ramal")
	private String ramal;

	@Transient
	private List<Visita> visitaList;

}
