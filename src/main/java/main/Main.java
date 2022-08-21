package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean("miki",Parrot.class);

        System.out.println(parrot.getName());
        System.out.println(context.getBean(String.class));
        System.out.println(context.getBean(Integer.class));
    }
}
