package com.yelzhan.lil.fid;

import com.yelzhan.lil.fid.config.ApplicationConfig;
import com.yelzhan.lil.fid.service.OutputService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = context.getBean(OutputService.class);

        for (int i=0;i<5;i++){
            outputService.generateOutput();
            Thread.sleep(5000);
        }
    }
}