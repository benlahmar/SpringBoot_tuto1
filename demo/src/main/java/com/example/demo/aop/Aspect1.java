/**
 * 
 */
package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author BENLAHMAR EL Habib
 *
 */
@Aspect

public class Aspect1 {

	
	private static final Logger log = LoggerFactory.getLogger(Aspect1.class);

	
	//@Before("execution(* com.example.demo.services.BillManager.*(..))")
	public void demarage(JoinPoint jp)
	{
		log.info("debut de la méthode  "+jp.getSignature().getName());
		
	}
	
	
	//@After("execution(* com.example.demo.services.BillManager.*(..))")
	public void fin(JoinPoint jp)
	{
		log.info("fin de la méthode  addcomand"+jp.getSignature().getName());
		
	}
}
