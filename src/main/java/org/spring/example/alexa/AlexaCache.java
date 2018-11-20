package org.spring.example.alexa;


import org.spring.example.config.ReputationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class AlexaCache {

    @Autowired
    public AlexaCache(ReputationConfiguration reputationConfiguration) {
        System.out.println("AlexaCache created");
    }


    public void sayHello(){
        System.out.println("-------------> Hello " + AlexaCache.class.getName());
    }
}
