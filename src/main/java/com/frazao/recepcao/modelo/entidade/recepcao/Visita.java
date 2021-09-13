
package com.frazao.recepcao.modelo.entidade.recepcao;

import java.time.LocalDateTime;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	private Funcionario autorizador;

	@Column(name = "entrada")
	@Basic
	private LocalDateTime entrada;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "incluido_por_id")
	private Usuario incluidoPor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "entrada_local_id")
	private Local entradaLocal;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "destino_local_id")
	private Local destinoLocal;

	@Column(name = "motivo")
	@Lob
	private String motivo;

	@OneToMany(mappedBy = "visita")
	private List<VisitaVisitante> visitaVisitanteList;
	
	public String toString() {
		return String.format("Visita [${this.id}]", this.id) ;
	}

}
