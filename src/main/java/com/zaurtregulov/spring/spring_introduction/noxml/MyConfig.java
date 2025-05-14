package com.zaurtregulov.spring.spring_introduction.noxml;

import com.zaurtregulov.spring.spring_introduction.Cat;
import com.zaurtregulov.spring.spring_introduction.Person;
import com.zaurtregulov.spring.spring_introduction.Pet;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean() {
        System.out.println("!!!");
        return new Cat();
    }
    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
