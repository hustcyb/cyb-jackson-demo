package com.cyb.jackson.demo.domain;

import com.google.common.base.Objects;

public class Child_1_1 extends Base_1 {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 2 * hashCode() + 3 * Objects.hashCode(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}

		Child_1_1 child = (Child_1_1) obj;
		if (child == null) {
			return false;
		}

		return Objects.equal(name, child.getName());
	}
}
