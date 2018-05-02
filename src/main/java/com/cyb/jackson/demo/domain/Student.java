package com.cyb.jackson.demo.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 学生
 * 
 * @author Administrator
 *
 */
public class Student {

	/**
	 * 编号
	 */
	private Integer id;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 年龄
	 */
	private Date birthdate;

	/**
	 * 初始化
	 */
	public Student() {
	}

	/**
	 * 初始化
	 * 
	 * @param id
	 *            编号
	 * @param name
	 *            姓名
	 * @param birthdate
	 *            年龄
	 */
	public Student(Integer id, String name, Date birthdate) {
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
}
