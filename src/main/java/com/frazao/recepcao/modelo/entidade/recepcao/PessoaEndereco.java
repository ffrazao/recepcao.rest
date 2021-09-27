package com.frazao.recepcao.modelo.entidade.recepcao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.frazao.recepcao.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "PessoaEndereco")
@Table(name = "pessoa_endereco")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PessoaEndereco extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pessoa_id")
	@JsonIgnore
	private Pessoa pessoa;

	public PessoaEndereco(Integer id) {
		super(id);
	}

}
