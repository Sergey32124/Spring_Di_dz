package org.example.spring_di_dz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.spring_di_dz")
public class Config {
    @Bean public Engine engine(){
        Engine engine=new Engine();
        engine.setType("1");
        return engine;
    }
    @Bean public Engine engine1(){
        Engine engine=new Engine();
        engine.setType("2");
        return engine;
    }
    @Bean public Auto auto(){
        Auto auto=new Auto();
        auto.setModel("FF");

        auto.setEngine(engine());
        return auto;
    }
    @Bean public Auto auto1(){
        Auto auto=new Auto();
        auto.setModel("FFор");

        auto.setEngine(engine1());
        return auto;
    }

}
