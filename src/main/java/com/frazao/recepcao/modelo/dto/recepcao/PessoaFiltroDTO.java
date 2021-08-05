package com.frazao.recepcao.modelo.dto.recepcao;

import java.util.HashSet;
import java.util.Set;

import com.frazao.recepcao.modelo.dominio.recepcao.PessoaTipo;
import com.frazao.recepcao.modelo.dto.FiltroIdDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PessoaFiltroDTO extends FiltroIdDTO {

	private static final long serialVersionUID = 1L;

	private String cpfCnpj;

	private String nome;

	private Set<PessoaTipo> pessoaTipo = new HashSet<>();

}
