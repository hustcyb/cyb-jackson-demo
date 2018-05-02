package com.cyb.jackson.demo.query;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/*
 * 学生查询条件
 */
public class StudentQuery {

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 年龄
	 */
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date birthdate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
}
