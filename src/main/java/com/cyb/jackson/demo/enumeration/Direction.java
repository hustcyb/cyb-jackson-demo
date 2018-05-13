package com.cyb.jackson.demo.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.base.Objects;

/**
 * 方位
 * @author Administrator
 *
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Direction {
	East((byte)0, "东"),
	South((byte)1, "南"),
	West((byte)2, "西"),
	North((byte)3, "北");

	/**
	 * 值
	 */
	private byte value;

	/**
	 * 类型
	 */
	private String name;

	private Direction(byte value, String name) {
		this.value = value;
		this.name = name;
	}

	public byte getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
	
	/**
	 * 获取方位值获取方位
	 * @param value 方位值
	 * @return 方位
	 */
	@JsonCreator
	public static Direction valueOf(Byte value) {
		for (Direction direction : values()) {
			if (Objects.equal(value, direction.getValue())) {
				return direction;
			}
		}
		
		return null;
	}
}
