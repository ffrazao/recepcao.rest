package com.frazao.recepcao.modelo.entidade.recepcao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.frazao.recepcao.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "UnidadeOrganizacional")
@Table(schema = "recepcao", name = "unidade_organizacional")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class UnidadeOrganizacional extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Transient
	private List<Local> localList;

	@Transient
	private List<Lotacao> lotacaoList;

	@Column(name = "nome")
	private String nome;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pai_id")
	private com.frazao.recepcao.modelo.entidade.recepcao.UnidadeOrganizacional paiId;

	@Transient
	private List<UnidadeOrganizacional> unidadeOrganizacionalList;

}
