package com.jms.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    WelcomeInfo welcomeInfo;

    @Autowired
    PersonalInfo personalInfo;

    @GetMapping("/greeting")
    public String greeting() {
        return welcomeInfo.getGreeting();
    }

    @GetMapping("/email")
    public String getDbProperties() {
        return personalInfo.getEmail();
    }

}
