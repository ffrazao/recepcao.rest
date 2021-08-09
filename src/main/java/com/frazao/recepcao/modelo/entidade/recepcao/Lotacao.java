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

import com.frazao.recepcao.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Lotacao")
@Table(schema = "recepcao", name = "lotacao")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class Lotacao extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "funcionario_id")
	private com.frazao.recepcao.modelo.entidade.recepcao.Lotacao funcionarioId;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "ramal")
	private String ramal;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "unidade_organizacional_id")
	private com.frazao.recepcao.modelo.entidade.recepcao.Lotacao unidadeOrganizacionalId;

}
