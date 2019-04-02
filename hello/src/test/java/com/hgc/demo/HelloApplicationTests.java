package com.hgc.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {
	@Autowired
	Person person;
	@Autowired
	Person1 person1;
	@Autowired
	Person2 person2;
	@Autowired
	ApplicationContext context;

	@Test
	public void contextLoads() {
//		System.out.println(person1);
//		System.out.println(person);
//		System.out.println(person2);
		Object person3=context.getBean("person3");
		System.out.println(person3);
	}

}
