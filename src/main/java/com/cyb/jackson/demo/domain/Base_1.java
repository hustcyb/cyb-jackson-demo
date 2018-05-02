package com.cyb.jackson.demo.domain;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.google.common.base.Objects;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "typeName")
@JsonSubTypes({ @JsonSubTypes.Type(value = Child_1_1.class, name = "child1"),
		@JsonSubTypes.Type(value = Child_1_2.class, name = "child2") })
public abstract class Base_1 {

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		Base_1 base = (Base_1) obj;
		if (base == null) {
			return false;
		}

		return Objects.equal(this.id, base.id);
	}
}
