package co.m.cl.demo;

import javax.mail.MessagingException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cl.demo.TestSend;

public class TestJavaMail {

	@Test
	public void testMail() throws MessagingException{
		ApplicationContext c=new ClassPathXmlApplicationContext("classpath:applicationContext_mail.xml");
		TestSend send = (TestSend) c.getBean("testSend");
		send.sendMail();
	}
	
}
