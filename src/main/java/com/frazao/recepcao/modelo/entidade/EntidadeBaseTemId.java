package com.frazao.recepcao.modelo.entidade;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public abstract class EntidadeBaseTemId<Id> extends EntidadeBase implements TemId<Id> {

	private static final long serialVersionUID = 1L;
	
	private Id id;

	@Override
	public String toString() {
		return String.format("Id = %d", this.getId());
	}
	
	public EntidadeBaseTemId(Id id) {
		super();
		this.setId(id);
	}

	@Override
	public Id getId() {
		return this.id;
	}

	@Override
	public void setId(Id id) {
		this.id = id;
	}

}
