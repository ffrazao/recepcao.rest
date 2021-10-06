package com.frazao.recepcao.modelo.entidade.recepcao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.frazao.recepcao.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Visitante")
@Table(name = "visitante")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Visitante extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "e_mail")
	private String eMail;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "entidade_representante_id")
	private EntidadeRepresentante entidadeRepresentante;

	@Column(name = "foto")
	@Lob
	private byte[] foto;

	@Column(name = "telefone")
	private String telefone;

	@Transient
	private List<VisitaVisitante> visitaVisitanteList;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    @JsonIgnoreProperties(value = {"visitante"})
    private Pessoa pessoa;

	@Override
	public String toString() {
		return String.format("Id = %d", this.getId());
	}


}
