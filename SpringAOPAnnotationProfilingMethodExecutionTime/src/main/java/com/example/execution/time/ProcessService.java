package com.example.execution.time;

import org.springframework.stereotype.Service;

@Service
public class ProcessService implements Process {

    @Override
    @LogExecTime
    public void startProcess() {
        System.out.println("Starting process ... this will take some while ...");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Hmmm ... I was starting a process here!", e);
        }

        System.out.println("Process successfully started!");
    }

    @Override
    public void stopProcess() {
        System.out.println("Stopping process ... this will take some while ...");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Hmmm ... I was stopping a long-running process here!", e);
        }

        System.out.println("Process successfully stopped!");
    }
}
