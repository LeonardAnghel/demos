package com.example.execution.time;

import java.util.concurrent.TimeUnit;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProcessProfiler {
       
    @Around(value = "@annotation(LogExecTime)")
    public Object profile(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        
        long start = System.nanoTime();        
        System.out.println("Going to call the method.");
        
        Object output = proceedingJoinPoint.proceed();        
        System.out.println("Method execution completed.");
        
        long elapsedNanoTime = System.nanoTime() - start;
        System.out.println("Method execution time: "
                + TimeUnit.MILLISECONDS.convert(elapsedNanoTime, TimeUnit.NANOSECONDS) + " milliseconds.");
        
        return output;
    }
}
