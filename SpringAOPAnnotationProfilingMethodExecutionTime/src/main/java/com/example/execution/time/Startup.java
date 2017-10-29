package com.example.execution.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Startup implements CommandLineRunner {    

    @Autowired
    private Process process;
    
    @Override
    public void run(String... strings) throws Exception {
        
        process.startProcess();
        process.stopProcess();
    }
}
