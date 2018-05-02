package com.cyb.jackson.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyb.jackson.demo.domain.Student;
import com.cyb.jackson.demo.query.StudentQuery;
import com.cyb.jackson.demo.service.StudentService;

/**
 * 学生控制器
 * 
 * @author Administrator
 *
 */
@RequestMapping("students")
@RestController
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	/**
	 * 根据条件查询学生列表
	 * 
	 * @param query
	 *            查询条件
	 * @return 学生列表
	 */
	@GetMapping
	public List<Student> listByQuery(StudentQuery query) {
		return studentService.listByQuery(query);
	}

	/**
	 * 根据记录编号获取学生
	 * 
	 * @param id
	 *            学生编号
	 * @return 学生
	 */
	@GetMapping("{id}")
	public Student getById(@PathVariable Integer id) {
		return studentService.getById(id);
	}
}
