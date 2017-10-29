package com.example.execution.time;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAopProfilingMethodExecutionTimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopProfilingMethodExecutionTimeApplication.class, args);                
    }  
}
