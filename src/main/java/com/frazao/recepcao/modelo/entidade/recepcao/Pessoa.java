package com.frazao.recepcao.modelo.entidade.recepcao;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.frazao.recepcao.modelo.dominio.recepcao.PessoaTipo;
import com.frazao.recepcao.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Pessoa")
@Table(name = "pessoa")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Pessoa extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Column(name = "contato1")
	private String contato1;

	@Column(name = "contato2")
	private String contato2;

	@Column(name = "contato3")
	private String contato3;

	@Column(name = "cpf_cnpj")
	private String cpfCnpj;

	@Column(name = "email")
	private String email;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;

	@OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties(value = { "pessoa" })
	private List<PessoaEndereco> pessoaEnderecoList;

	@Column(name = "tipo")
	@Enumerated(EnumType.STRING)
	private PessoaTipo pessoaTipo;

	@Transient
	private List<Usuario> usuarioList;

	public Pessoa(Integer id) {
		super(id);
	}

	@Override
	public String toString() {
		return String.format("Id = %d", this.getId());
	}

}
