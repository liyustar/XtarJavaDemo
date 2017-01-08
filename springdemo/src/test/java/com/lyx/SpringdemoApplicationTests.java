package com.lyx;

import com.lyx.exception.PerformanceException;
import com.lyx.iface.Performer;
import com.lyx.iface.Thinker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration( {"idol.xml"} )
public class SpringdemoApplicationTests {

	@Autowired
	Performer duke;

	@Autowired
	Magician magician;

	@Autowired
	Thinker volunteer;


	@Test
	public void contextLoads() throws PerformanceException {
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("com/lyx/idol.xml");
		// Performer duke = (Performer) ctx.getBean("duke");
		duke.perform();
	}

	@Test
	public void magicianShouldReadVolunteersMind() {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/lyx/idol.xml");
//        Magician magician = (Magician) ctx.getBean("magician");
//        Volunteer volunteer = (Volunteer) ctx.getBean("volunteer");

		volunteer.thinkOfSomething("haha");
		assertEquals("haha", magician.getThoughts());
	}
}
