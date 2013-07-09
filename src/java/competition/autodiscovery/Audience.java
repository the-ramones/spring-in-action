package competition.autodiscovery;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 *
 * @author the-ramones
 */
@Component
public class Audience {

    public Audience() {
    }

    public void takeSeats() {
        System.out.println("The audience is taking their seats");
    }

    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cell phones");
    }

    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }

    public void demandRefund() {
        System.out.println("Boo! We want our money back!");
    }

    // Use ProceedingJoinpoint as a  parameter to achieve context
    public void watching(ProceedingJoinPoint join) throws Throwable {
        System.out.println("Audience is watching as the instrument is playing");

        join.proceed();

        System.out.println("Audience has finished watching");
    }
}
