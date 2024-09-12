package org.example.spring_di_dz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var conteiner=new AnnotationConfigApplicationContext(Config.class);
        Auto auto=conteiner.getBean("auto",Auto.class);
        System.out.println(auto);
        Auto auto1=conteiner.getBean("auto1",Auto.class);
        System.out.println(auto1);
        Engine engine=conteiner.getBean("engine", Engine.class);
        System.out.println(engine);
        Engine engine1= conteiner.getBean("engine1", Engine.class);
        System.out.println(engine1);
    }
}
