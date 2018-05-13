package com.cyb.jackson.demo.enumeration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cyb.jackson.demo.App;
import com.cyb.jackson.demo.util.JsonUtils;

/**
 * 方位序列化
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class DirectionTest {

	/**
	 * 测试方位东序列化
	 */
	@Test
	public void testEastSerialization() {
		Direction direction = Direction.East;
		String json = JsonUtils.bean2Json(direction);
		assertEquals("{\"value\":0,\"name\":\"东\"}", json);
	}

	/**
	 * 测试方位东反序列化
	 */
	@Test
	public void testEastDeserialization() {
		String json = "0";
		Direction gender = JsonUtils.json2Bean(json, Direction.class);
		assertEquals(Direction.East, gender);
	}

	/**
	 * 测试方位南序列化
	 */
	@Test
	public void testSouthSerialization() {
		Direction direction = Direction.South;
		String json = JsonUtils.bean2Json(direction);
		assertEquals("{\"value\":1,\"name\":\"南\"}", json);
	}

	/**
	 * 测试方位南反序列化
	 */
	@Test
	public void testSouthDeserialization() {
		String json = "1";
		Direction direction = JsonUtils.json2Bean(json, Direction.class);
		assertEquals(Direction.South, direction);
	}

	/**
	 * 测试方位西序列化
	 */
	@Test
	public void testWestSerialization() {
		Direction direction = Direction.West;
		String json = JsonUtils.bean2Json(direction);
		assertEquals("{\"value\":2,\"name\":\"西\"}", json);
	}

	/**
	 * 测试方位西反序列化
	 */
	@Test
	public void testWestDeserialization() {
		String json = "2";
		Direction direction = JsonUtils.json2Bean(json, Direction.class);
		assertEquals(Direction.West, direction);
	}

	/**
	 * 测试方位北序列化
	 */
	@Test
	public void testNorthSerialization() {
		Direction direction = Direction.North;
		String json = JsonUtils.bean2Json(direction);
		assertEquals("{\"value\":3,\"name\":\"北\"}", json);
	}

	/**
	 * 测试方位北反序列化
	 */
	@Test
	public void testNorthDeserialization() {
		String json = "3";
		Direction direction = JsonUtils.json2Bean(json, Direction.class);
		assertEquals(Direction.North, direction);
	}
}
