package spring.project.vendas.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config {

    @Bean
    public String applicationName(){
        return "Sales System";
    }


}
