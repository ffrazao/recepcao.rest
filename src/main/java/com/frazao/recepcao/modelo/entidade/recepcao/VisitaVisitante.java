package com.frazao.recepcao.modelo.entidade.recepcao;

import java.time.LocalDateTime;

import javax.persistence.Basic;
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

@Entity(name = "VisitaVisitante")
@Table(schema = "recepcao", name = "visita_visitante")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class VisitaVisitante extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Column(name = "e_mail")
	private String email;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "entidade_representante_id")
	private EntidadeRepresentante entidadeRepresentante;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "saida")
	@Basic
	private LocalDateTime saida;

	@Column(name = "telefone")
	private String telefone;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "visita_id")
	@JsonIgnore
	private Visita visita;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "visitante_id")
	private Visitante visitante;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "saida_usuario_id")
	private Usuario saidaUsuario;

}
