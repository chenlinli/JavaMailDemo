package com.cl.demo;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class TestSend {

	private JavaMailSender javaMailSender;
	public void setJavaMailSender(JavaMailSender javaMailSender){
		this.javaMailSender = javaMailSender;
	}
	
	public void sendMail() throws MessagingException{
		//创建邮件
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		//邮件包装工具
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
		//发件人
		helper.setFrom("aaa@store.com");
		helper.setTo("bbb@store.com");
		helper.setSubject("Mail Test");
		helper.setText("JHava Mail Box");
		javaMailSender.send(mimeMessage);
	}
}
