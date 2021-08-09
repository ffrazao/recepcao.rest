package com.frazao.recepcao.modelo.entidade.recepcao;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.frazao.recepcao.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Visita")
@Table(schema = "recepcao", name = "visita")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class Visita extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "autorizador_id")
	private com.frazao.recepcao.modelo.entidade.recepcao.Visita autorizadorId;

	@Column(name = "entrada")
	@Basic
	private java.time.LocalDateTime entrada;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "incluido_por_id")
	private com.frazao.recepcao.modelo.entidade.recepcao.Visita incluidoPorId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "local_id")
	private com.frazao.recepcao.modelo.entidade.recepcao.Visita localId;

	@Column(name = "motivo")
	@Lob
	private String motivo;

	@Column(name = "saida")
	@Basic
	private java.time.LocalDateTime saida;

	@Transient
	private List<VisitaVisitante> visitaVisitanteList;

}
