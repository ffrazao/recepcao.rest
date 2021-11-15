package com.frazao.recepcao.modelo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public abstract class FiltroDTO implements DTO {

	private static final long serialVersionUID = 1L;

	private Integer pagina = 1;
	private Integer tamanho = 100;

}
