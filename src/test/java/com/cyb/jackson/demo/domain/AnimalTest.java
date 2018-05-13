package com.cyb.jackson.demo.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cyb.jackson.demo.App;
import com.cyb.jackson.demo.util.JsonUtils;

/**
 * 动物单元测试用例
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class AnimalTest {
	
	/**
	 * 测试鸟序列化
	 */
	@Test
	public void testBirdSerialization() {
		Bird bird = new Bird();
		bird.setName("Eagle");
		bird.setFlySpeed(260);

		String json = JsonUtils.bean2Json(bird);
		assertEquals("{\"name\":\"Eagle\",\"flySpeed\":260,\"animalType\":\"Bird\"}",
				json);
	}
	
	/**
	 * 测试鸟充序列化
	 */
	@Test
	public void testBirdDeserialization() {
		String json = "{\"name\":\"Eagle\",\"flySpeed\":260,\"animalType\":\"Bird\"}";
		Animal animal = JsonUtils.json2Bean(json, Animal.class);
		
		Bird bird = new Bird();
		bird.setName("Eagle");
		bird.setFlySpeed(260);
		
		assertEquals(animal, bird);
	}
	
	/**
	 * 测试狗序列化
	 */
	@Test
	public void testDogSerialization() {
		Bird bird = new Bird();
		bird.setName("Eagle");
		bird.setFlySpeed(260);

		String json = JsonUtils.bean2Json(bird);
		assertEquals("{\"name\":\"Eagle\",\"flySpeed\":260,\"animalType\":\"Bird\"}",
				json);
	}
	
	/**
	 * 测试鸟充序列化
	 */
	@Test
	public void testDogDeserialization() {
		String json = "{\"name\":\"Eagle\",\"flySpeed\":260,\"animalType\":\"Bird\"}";
		Animal animal = JsonUtils.json2Bean(json, Animal.class);
		
		Bird bird = new Bird();
		bird.setName("Eagle");
		bird.setFlySpeed(260);
		
		assertEquals(animal, bird);
	}
}
