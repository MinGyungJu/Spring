package aop1_xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.core.annotation.Order;

public class sampleAdvice {
	
	public Object around(ProceedingJoinPoint point) throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("<<<<<사전작업>>>>>>>>>"+methodName);
		Object obj = point.proceed();
		System.out.println("<<<<<사후작업>>>>>>>>>"+methodName);
		return obj;
	}
}
