package web.config;

import hu.iit.me.controller.service.BasicCalculator;
import hu.iit.me.controller.service.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorApplicationMethodContext {

    @Bean
    public Calculator calculator(){
        return new BasicCalculator();
    }

    @Bean
    public String helloworld(){
        return "Hello World";
    }
}
