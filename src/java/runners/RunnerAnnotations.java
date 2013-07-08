package runners;

import competition.annotation.Auditorium;
import competition.annotation.Instrument;
import competition.annotation.Instrumentalist;
import competition.annotation.PerformanceException;
import competition.annotation.Performer;
import competition.annotation.Poem;
import competition.annotation.Ticket;
import java.math.BigDecimal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author paul
 */
public class RunnerAnnotations {

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("/web/WEB-INF/applicationContextAnnotation.xml");
        // You firmly must pull your application-context XML files into /WEB_INF/classes/ directory 
        // for appropriate locations inside war-file that is load to the web-server (Apache, JBoss)
        // classpath:applicationContext.xml - has been tested, work
        // classpath*:applicationContext.xml - has been tested, work
        // applicationContext.xml - has been tested, work
        // ApplicationContext ctx2 = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        Performer juggler = (Performer) ctx.getBean("juggler");
        Poem shakespeare = (Poem) ctx.getBean("shakespeare-poem");
        Performer poeticJuggler = (Performer) ctx.getBean("poetic-juggler");
        Instrument saxo = (Instrument) ctx.getBean("saxo");
        Auditorium auditorium = (Auditorium) ctx.getBean("auditorium");
        Instrumentalist kenny = (Instrumentalist) ctx.getBean("kenny");
        Instrumentalist kenny2 = (Instrumentalist) ctx.getBean("kenny2");
        Ticket t1 = (Ticket) ctx.getBean("ticket");
        Ticket t2 = (Ticket) ctx.getBean("ticket");
        Instrumentalist jenny = (Instrumentalist) ctx.getBean("Jenny");
        Performer  hank = (Performer) ctx.getBean("Hank");
        Performer hank2 = (Performer) ctx.getBean("map-hank");
        Performer hank3 = (Performer) ctx.getBean("prop-hank");
        
        // Autowiring
        Performer tenny = (Performer) ctx.getBean("tenny");

        try {
            juggler.perform();
            shakespeare.recite();
            poeticJuggler.perform();
            saxo.play();
            auditorium.turnOnTheLights();
            kenny.perform();
            kenny2.perform();
            auditorium.turnOffTheLights();
            t1.setPerformance("Shakira");
            t2.setPerformance("Pitbull");
            t1.setPrice(BigDecimal.valueOf(10.99));
            t2.setPrice(BigDecimal.valueOf(12.99));
            t1.print(); t2.print();
            jenny.perform();
            System.out.println("Hank:");
            hank.perform();
            System.out.println("Map Hank:");
            hank2.perform();
            System.out.println("Properties Hank:");
            hank3.perform();
            
            // Autowiring
            tenny.perform();
            
        } catch (PerformanceException e) {
            System.err.println("Something bad has happend: " + e.getMessage());
        }
    }
}
