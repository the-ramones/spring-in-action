package competition.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 *
 * @author the-ramones
 */
@Aspect
//@Component
public class Audience {

    @Pointcut("execution(* competiotion.aop.annotation.Performer.perform(..))")
    public void performance() {        
    }
    
    public Audience() {
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("The audience is taking their seats");
    }
    
    @Before("performance()")
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cell phones");
    }

    @AfterReturning("performance()")
    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }
    
    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Boo! We want our money back!");
    }

    // Use ProceedingJoinpoint as a  parameter to achieve context
    @Around("performance()")
    public void watching(ProceedingJoinPoint join) throws Throwable {
        System.out.println("Audience is watching as the instrument is playing");

        join.proceed();

        System.out.println("Audience has finished watching");
    }
}
