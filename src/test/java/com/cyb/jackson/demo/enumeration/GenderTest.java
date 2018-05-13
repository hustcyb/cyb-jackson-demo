package com.cyb.jackson.demo.enumeration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cyb.jackson.demo.App;
import com.cyb.jackson.demo.util.JsonUtils;

/**
 * 性别单元测试用例
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class GenderTest {

	/**
	 * 测试性别男序列化
	 */
	@Test
	public void testMaleSerialization() {
		Gender gender = Gender.Male;
		String json = JsonUtils.bean2Json(gender);
		assertEquals("0", json);
	}
	
	/**
	 * 测试性别男反序列化
	 */
	@Test
	public void testMaleDeserialization() {
		String json = "0";
		Gender gender = JsonUtils.json2Bean(json, Gender.class);
		assertEquals(Gender.Male, gender);
	}

	/**
	 * 测试性别女序列化
	 */
	@Test
	public void testFemaleSerialization() {
		Gender gender = Gender.Female;
		String json = JsonUtils.bean2Json(gender);
		assertEquals("1", json);
	}
	
	/**
	 * 测试性别女反序列化
	 */
	@Test
	public void testFemaleDeserialization() {
		String json = "1";
		Gender gender = JsonUtils.json2Bean(json, Gender.class);
		assertEquals(Gender.Female, gender);
	}

	/**
	 * 测试空值序列化
	 */
	@Test
	public void testNullSerialization() {
		Gender gender = null;
		String json = JsonUtils.bean2Json(gender);
		assertEquals("null", json);
	}
	
	/**
	 * 测试空值反序列化
	 */
	@Test
	public void testNullDeserialization() {
		String json = "null";
		Gender gender = JsonUtils.json2Bean(json, Gender.class);
		assertEquals(null, gender);
	}
}
