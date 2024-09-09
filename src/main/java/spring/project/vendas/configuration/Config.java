package spring.project.vendas.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//  A anotação @Profile("development")  deixa essa configuração disponivel apenas para o perfil "development"
public class Config {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DO PRODUCTION");
        };
    }


}
