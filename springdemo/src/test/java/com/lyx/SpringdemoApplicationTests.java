package com.lyx;

import com.lyx.exception.PerformanceException;
import com.lyx.iface.Performer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdemoApplicationTests {

	@Test
	public void contextLoads() throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("idol.xml");

		Performer pf = (Performer) ctx.getBean("duke");
		pf.perform();
	}
}
