package spring.project.vendas;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // a @interface Development só pode ser usada em classes
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@Profile("development")
public @interface Development {
}
