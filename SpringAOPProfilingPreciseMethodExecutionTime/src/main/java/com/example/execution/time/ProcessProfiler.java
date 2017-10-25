package com.example.execution.time;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.util.StopWatch.TaskInfo;

@Aspect
@Component
public class ProcessProfiler {

    @Pointcut("execution(* com.example.execution.time.*.*(..))")
    public void processMethods() {
    }

    @Around("processMethods()")
    public Object profile(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start(proceedingJoinPoint.toShortString());
        
        boolean isExceptionThrown = false;
        try {        
            return proceedingJoinPoint.proceed();
        } catch (RuntimeException e) {
            isExceptionThrown = true;
            throw e;
        } finally {
            stopWatch.stop();
            TaskInfo taskInfo = stopWatch.getLastTaskInfo();
           
            String profileMessage = taskInfo.getTaskName() + ": " + taskInfo.getTimeMillis() + " ms"
                    + (isExceptionThrown ? " (thrown Exception)" : "");
            
            System.out.println(profileMessage);
        }
    }

}
