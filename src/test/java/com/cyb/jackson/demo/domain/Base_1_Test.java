package com.cyb.jackson.demo.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cyb.jackson.demo.App;
import com.cyb.jackson.demo.util.JsonUtils;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class Base_1_Test {
	
	private static final Logger logger = LoggerFactory.getLogger(Base_1_Test.class);

	@Test
	public void test() {
		Child_1_1 child1 = new Child_1_1();
		child1.setId(1);
		child1.setName("Jim");
		
		Child_1_2 child2 = new Child_1_2();
		child2.setId(2);
		child2.setAge((byte)10);
		
		String json = JsonUtils.bean2Json(new Base_1[] { child1, child2 });
		logger.info(json);
		Base_1[] array = JsonUtils.json2Bean(json, Base_1[].class);
		
		assertEquals(array.length, 2);
		assertEquals(child1, array[0]);
		assertEquals(child2, array[1]);
	}
}
