package runners;

import competition.Auditorium;
import competition.Instrument;
import competition.Instrumentalist;
import competition.PerformanceException;
import competition.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author paul
 */
public class Runner {

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("/web/WEB-INF/applicationContext.xml");
        // You firmly must pull your application-context XML files into /WEB_INF/classes/ directory 
        // for appropriate locations inside war-file that is load to the web-server (Apache, JBoss)
        // classpath:applicationContext.xml - has been tested, work
        // classpath*:applicationContext.xml - has been tested, work
        // applicationContext.xml - has been tested, work
        // ApplicationContext ctx2 = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        Performer juggler = (Performer) ctx.getBean("juggler");
        Performer poeticJuggler = (Performer) ctx.getBean("poetic-juggler");
        Instrument saxo = (Instrument) ctx.getBean("saxo");
        Auditorium auditorium = (Auditorium) ctx.getBean("auditorium");
        Instrumentalist kenny = (Instrumentalist) ctx.getBean("kenny");
        Instrumentalist kenny2 = (Instrumentalist) ctx.getBean("kenny2");

        try {
            juggler.perform();
            poeticJuggler.perform();
            saxo.play();
            auditorium.turnOnTheLights();
            kenny.perform();
            kenny2.perform();
            auditorium.turnOffTheLights();

        } catch (PerformanceException e) {
            System.err.println("Something bad has happend: " + e.getMessage());
        }
    }
}
