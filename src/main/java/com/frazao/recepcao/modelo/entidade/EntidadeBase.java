package com.frazao.recepcao.modelo.entidade;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@NoArgsConstructor
@EqualsAndHashCode
public abstract class EntidadeBase implements Serializable {

	private static final long serialVersionUID = 1L;

}
