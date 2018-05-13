package com.cyb.jackson.demo.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.cyb.jackson.demo.domain.Student;
import com.cyb.jackson.demo.enumeration.Direction;
import com.cyb.jackson.demo.enumeration.Gender;
import com.cyb.jackson.demo.query.StudentQuery;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;

/**
 * 学生服务
 * 
 * @author Administrator
 *
 */
@Service
public class StudentService {

	/**
	 * 学生列表
	 */
	private final List<Student> students = Lists.newArrayList();

	public StudentService() {
		Calendar calendar = Calendar.getInstance();

		Student jim = new Student();
		jim.setId(1);
		jim.setName("Jim");
		jim.setGender(Gender.Male);
		jim.setDirection(Direction.South);
		calendar.set(2001, 0, 1, 0, 0, 0);
		jim.setBirthdate(calendar.getTime());
		students.add(jim);
	}

	/**
	 * 根据条件查询学生列表
	 * 
	 * @param query
	 *            查询条件
	 * @return 学生列表
	 */
	public List<Student> listByQuery(StudentQuery query) {
		if (query == null) {
			query = new StudentQuery();
		}

		List<Student> queryStudents = Lists.newArrayList();
		for (Student student : students) {
			String queryName = query.getName();
			String studentName = student.getName();
			if (!StringUtils.isEmpty(queryName)
					&& !Objects.equal(queryName, studentName)) {
				continue;
			}

			Date queryBirthdate = query.getBirthdate();
			Date studentBirthdate = student.getBirthdate();
			if (queryBirthdate != null && !DateUtils.isSameDay(queryBirthdate, studentBirthdate)) {
				continue;
			}

			queryStudents.add(student);
		}

		return queryStudents;
	}

	/**
	 * 根据学生编号查询学生
	 * 
	 * @param id
	 *            学生编号
	 * @return 学生
	 */
	public Student getById(Integer id) {
		for (Student student : students) {
			if (Objects.equal(id, student.getId())) {
				return student;
			}
		}

		return null;
	}
	
	public Integer save(Student student) {
		if (student == null) {
			return null;
		}
		
		Integer id;
		if (students.isEmpty()) {
			id = 1;
		} else {
			int lastIndex = students.size() - 1;
			Student lastStudent = students.get(lastIndex);
			id = lastStudent.getId() + 1;
		}
		
		student.setId(id);
		students.add(student);
		return id;
	}
}
