package com.cyb.jackson.demo.domain;

import com.cyb.jackson.demo.enumeration.AnimalType;
import com.google.common.base.Objects;

public class Bird extends Animal {

	private Integer flySpeed;

	@Override
	public AnimalType getAnimalType() {
		return AnimalType.Bird;
	}

	public Integer getFlySpeed() {
		return flySpeed;
	}

	public void setFlySpeed(Integer name) {
		this.flySpeed = name;
	}

	@Override
	public int hashCode() {
		return 2 * hashCode() + 3 * Objects.hashCode(flySpeed);
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}

		Bird bird = (Bird) obj;
		if (bird == null) {
			return false;
		}

		return Objects.equal(flySpeed, bird.getFlySpeed());
	}
}
