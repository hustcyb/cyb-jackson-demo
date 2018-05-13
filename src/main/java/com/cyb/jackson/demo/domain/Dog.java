package com.cyb.jackson.demo.domain;

import com.cyb.jackson.demo.enumeration.AnimalType;
import com.google.common.base.Objects;

public class Dog extends Animal {

	private Integer runSpeed;

	@Override
	public AnimalType getAnimalType() {
		return AnimalType.Dog;
	}

	public Integer getAge() {
		return runSpeed;
	}

	public void setAge(Integer age) {
		this.runSpeed = age;
	}

	@Override
	public int hashCode() {
		return 2 * hashCode() + 5 * Objects.hashCode(runSpeed);
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}

		Dog dog = (Dog) obj;
		if (dog == null) {
			return false;
		}

		return Objects.equal(runSpeed, dog.runSpeed);
	}
}
