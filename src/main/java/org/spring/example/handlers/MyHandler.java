package org.spring.example.handlers;

import org.spring.example.alexa.AlexaCache;
import org.spring.example.config.ReputationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyHandler {

    private final ReputationConfiguration reputationConfiguration;

    private final AlexaCache alexaCache;

    @Autowired
    public MyHandler(ReputationConfiguration reputationConfiguration, AlexaCache alexaCache) {
        this.reputationConfiguration = reputationConfiguration;
        this.alexaCache = alexaCache;
        System.out.println("MyHandler created " + reputationConfiguration.getSize());
        alexaCache.sayHello();
    }

    public void sayHello(){
        System.out.println("------------------------> Hello " + MyHandler.class.getName() + "  " + reputationConfiguration.getTimeout());
    }
}
