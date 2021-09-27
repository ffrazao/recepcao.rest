package com.frazao.recepcao.modelo.entidade;

import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode.Include;

@MappedSuperclass
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public abstract class EntidadeBaseTemId<Id> extends EntidadeBase implements TemId<Id> {

	private static final long serialVersionUID = 1L;

	public EntidadeBaseTemId(Id id) {
		super();
		this.setId(id);
	}

	@Override
	@Include
	public abstract Id getId();

	@Override
	public abstract void setId(Id id);

	@Override
	public String toString() {
		return String.format("Id = %d", this.getId());
	}

}
