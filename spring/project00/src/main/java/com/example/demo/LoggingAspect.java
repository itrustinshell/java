
/*Spring scansiona questo pacchetto perché anche 
la classe DemoApplication si trova lì 
(quella con @SpringBootApplication). */
package com.example.demo;


/**📚 Importa la classe JoinPoint, che serve per sapere qual 
 * è il metodo intercettato (nome, parametri, ecc.). */
import org.aspectj.lang.JoinPoint;

/**📚 Importa l’annotazione @Aspect, che serve per segnalare a Spring 
 * che questa classe contiene logica AOP (programmazione orientata agli aspetti). */
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.demo.Car.drive(..))")
    public void logBeforeDrive(JoinPoint joinPoint) {
        System.out.println("LOG: metodo → " + joinPoint.getSignature().getName());
    }
}
