package com.cyb.jackson.demo.domain;

import com.google.common.base.Objects;

public class Child_1_2 extends Base_1 {

	private Byte age;

	public Byte getAge() {
		return age;
	}

	public void setAge(Byte age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return 2 * hashCode() + 5 * Objects.hashCode(age);
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}

		Child_1_2 child = (Child_1_2) obj;
		if (child == null) {
			return false;
		}

		return Objects.equal(age, child.age);
	}
}
