package aop2_annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("aop2_annotation/applicationContext.xml");
		
		MessageBean bean = context.getBean("targetBean",MessageBean.class);
		
		bean.sayHello();
		System.out.println("------------------------------");
		bean.ensayHello();
		System.out.println("--------------------------------");
		bean.test();

	}

}
