package com.jms.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class EventListener implements ApplicationListener<EnvironmentChangeEvent> {

    @Autowired
    Controller refreshScopedService;

    @Override
    public void onApplicationEvent(EnvironmentChangeEvent event) {

        if (event.getKeys().contains("welcome.greeting")) {
            System.out.println("Welcome greeting properties changed");
        }
    }
}