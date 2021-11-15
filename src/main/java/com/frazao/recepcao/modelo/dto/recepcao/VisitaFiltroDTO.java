package com.frazao.recepcao.modelo.dto.recepcao;

import java.time.LocalDateTime;

import com.frazao.recepcao.modelo.dto.FiltroDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class VisitaFiltroDTO extends FiltroDTO {

	private static final long serialVersionUID = 1L;

	private Integer[] autorizadorList;
	private String cpf;
	private Integer[] destinoLocalList;
	private LocalDateTime entradaFim;
	private LocalDateTime entradaInicio;
	private Integer[] entradaLocalList;
	private Integer[] incluidoPorList;
	private String nome;

}