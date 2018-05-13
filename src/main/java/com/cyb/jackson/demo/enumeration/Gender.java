package com.cyb.jackson.demo.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.base.Objects;

/**
 * 性别
 * 
 * @author Administrator
 *
 */
public enum Gender {
	Male((byte) 0, "男"), Female((byte) 1, "女");

	/**
	 * 值
	 */
	private byte value;

	/**
	 * 名称
	 */
	private String name;

	private Gender(byte value, String name) {
		this.value = value;
		this.name = name;
	}

	@JsonValue
	public byte getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	@JsonCreator
	public static Gender valueOf(Byte value) {
		for (Gender gender : values()) {
			if (Objects.equal(value, gender.getValue())) {
				return gender;
			}
		}

		return null;
	}
}
