package com.springBatch06.main;

import com.springBatch06.main.config.BatchConfiguration;
import com.springBatch06.main.config.UserJob;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws Throwable {

        new AnnotationConfigApplicationContext(BatchConfiguration.class, UserJob.class);
    }
}
