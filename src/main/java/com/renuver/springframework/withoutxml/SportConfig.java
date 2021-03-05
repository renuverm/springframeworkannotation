package com.renuver.springframework.withoutxml;

import com.renuver.springframework.learn.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.renuver.springframework.learn")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    // define bean for our football coach and inject dependency, name is same as Bean ID
    @Bean
    public Coach footballCoach(){
        return new FootballCoach(sadFortuneService());
    }
}
