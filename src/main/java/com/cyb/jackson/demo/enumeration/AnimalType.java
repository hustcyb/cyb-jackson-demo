package com.cyb.jackson.demo.enumeration;

/**
 * 动物类型
 * 
 * @author Administrator
 *
 */
public enum AnimalType {
	Bird((byte) 0, "鸟"), Dog((byte) 1, "狗");

	/**
	 * 类型值
	 */
	private byte type;

	/**
	 * 名称
	 */
	private String name;

	private AnimalType(byte type, String name) {
		this.type = type;
		this.name = name;
	}

	public byte getType() {
		return type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
