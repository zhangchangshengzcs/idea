package com.hgc.junittest;

import com.hgc.JunittestApplication;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)//底层用junit SpringJUnit4ClassRunner
@SpringBootTest(classes = {JunittestApplication.class})//启动整个springboot工程
public class JunittestApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Test
	public void testOne(){
		System.out.println("test hello");
		TestCase.assertEquals(1,1);//断言
		//Assert.assertEquals(1,1);
	}
	@Test
	public void testTwo(){
		System.out.println("testTwo");
		TestCase.assertEquals(2,2);
	}
	@Before
	public void testBefore(){
		System.out.println("before");
	}
	@After
	public void testAfter(){
		System.out.println("after");
	}

}

