package com.frazao.recepcao.config.excessoes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class ApiValidationError extends ApiSubError {

	private String field;

	private String message;

	private String object;

	private Object rejectedValue;

	ApiValidationError(String object, String message) {
		this.object = object;
		this.message = message;
	}

	public ApiValidationError(String object, String field, Object rejectedValue, String message) {
		this.field = field;
		this.message = message;
		this.object = object;
		this.rejectedValue = rejectedValue;
	}

}