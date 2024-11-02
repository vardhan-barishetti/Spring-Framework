package com.config;

import com.live.components.Car;
import com.live.components.Wheel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.live.components"})
public class AppConfig {

    @Bean
    public Wheel wheel(){
        return new Wheel();
    }

}
