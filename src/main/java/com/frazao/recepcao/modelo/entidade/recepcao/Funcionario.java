package com.frazao.recepcao.modelo.entidade.recepcao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.frazao.recepcao.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Funcionario")
@Table(name = "funcionario")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Funcionario extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;

	@OneToMany(mappedBy = "funcionario")
	private List<Lotacao> lotacaoList;

	@Column(name = "matricula")
	private String matricula;

	@OneToOne
	@MapsId
	@JoinColumn(name = "id")
	private Pessoa pessoa;

	@Column(name = "ramal")
	private String ramal;

	@Override
	public String toString() {
		return String.format("Id = %d", this.getId());
	}

}
