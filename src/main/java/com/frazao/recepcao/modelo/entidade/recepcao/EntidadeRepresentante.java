package com.frazao.recepcao.modelo.entidade.recepcao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.frazao.recepcao.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "EntidadeRepresentante")
@Table(schema = "recepcao", name = "entidade_representante")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class EntidadeRepresentante extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;

}
