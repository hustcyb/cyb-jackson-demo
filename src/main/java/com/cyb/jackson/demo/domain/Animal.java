package com.cyb.jackson.demo.domain;

import com.cyb.jackson.demo.enumeration.AnimalType;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.google.common.base.Objects;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "animalType")
@JsonSubTypes({ @JsonSubTypes.Type(Bird.class), @JsonSubTypes.Type(Dog.class) })
public abstract class Animal {

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 动物类型
	 */
	public abstract AnimalType getAnimalType();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(name);
	}

	@Override
	public boolean equals(Object obj) {
		Animal animal = (Animal) obj;
		if (animal == null) {
			return false;
		}

		return Objects.equal(this.name, animal.name);
	}
}
