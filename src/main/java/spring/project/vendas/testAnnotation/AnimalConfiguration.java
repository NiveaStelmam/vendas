package spring.project.vendas.testAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.project.vendas.testAnnotation.Animal;

@Configuration
public class AnimalConfiguration {

    @Bean(name="cachorro")
    public Animal cachorro(){
        return new Animal(){
            @Override
            public void especie(){
                System.out.println("Canis lupus familiaris");
            }
        };
    };

    @Bean(name="gato")
    public Animal gato(){
        return new Animal(){
            @Override
            public void especie(){
                System.out.println("Felis catus");
            }
        };
    };

}
