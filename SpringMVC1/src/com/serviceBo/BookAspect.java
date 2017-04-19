package com.serviceBo;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookAspect {
	
	@Before("execution(* com.serviceBo.BookBO.getBookDetails())")
	public void start() throws Throwable
	{
		System.out.println("Checking aspect");
		System.out.println("Vehicle stand check afterrrrrrrrrrrrrr");
		/*joinPoint.proceed();
		System.out.println("hijacked method: "+ joinPoint.getSignature().getName());
		System.out.println("hijacked arguments: "+Arrays.toString(joinPoint.getArgs()));
	*/}
	
	

}
