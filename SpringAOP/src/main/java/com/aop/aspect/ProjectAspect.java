package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ProjectAspect {

	@Before("execution(* com.aop.sevice.StudentServiceImpl.admit())")
	public void printBefore() {
		System.out.println("Before admission process...");
	}
	
	@After("execution(* com.aop.sevice.StudentServiceImpl.admit())")
	public void printAfter() {
		System.out.println("After admission process...");
	}
	
	@Before("execution(* com.aop.sevice.StudentServiceImpl.admit(..))")
	public void printBeforeWithParam() {
		System.out.println("Before call total student...");
	}
	
	@After("execution(* com.aop.sevice.StudentServiceImpl.admit(..))")
	public void printAfterWithParam() {
		System.out.println("After call total student...");
	}
}
