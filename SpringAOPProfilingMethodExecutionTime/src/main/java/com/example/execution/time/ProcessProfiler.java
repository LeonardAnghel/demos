package com.example.execution.time;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProcessProfiler {
    
    @Pointcut("execution(* com.example.execution.time.*.*(..))")
    public void processMethods() {
    }

    @Around("processMethods()")
    public Object profile(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        
        long start = System.currentTimeMillis();        
        System.out.println("Going to call the method.");
        
        Object output = proceedingJoinPoint.proceed();        
        System.out.println("Method execution completed.");
        
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Method execution time: " + elapsedTime + " milliseconds.");
        
        return output;
    }
}
