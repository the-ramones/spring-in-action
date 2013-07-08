package runners;

import competition.autodiscovery.Auditorium;
import competition.autodiscovery.Instrument;
import competition.autodiscovery.Instrumentalist;
import competition.autodiscovery.Juggler;
import competition.autodiscovery.JukeBox;
import competition.autodiscovery.PerformanceException;
import competition.autodiscovery.Performer;
import competition.autodiscovery.Poem;
import competition.autodiscovery.Ticket;
import competition.autodiscovery.Stage;
import java.math.BigDecimal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author the-ramones
 */
public class RunnerAutodiscovery {

    public static void main(String[] args) throws PerformanceException {
        
        ApplicationContext ctx = new FileSystemXmlApplicationContext("/web/WEB-INF/applicationContextAutodiscovery.xml");
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
        Instrument saxo2 = (Instrument) ctx.getBean("saxo");
        
        Instrumentalist instrumentalist = (Instrumentalist) ctx.getBean("instrumentalist");
        Instrumentalist instrumentalist2 = (Instrumentalist) ctx.getBean("instrumentalist");

        Ticket ticket1 = (Ticket) ctx.getBean("ticket");
        Ticket ticket2 = (Ticket) ctx.getBean("ticket");
        
        Auditorium auditorium = (Auditorium) ctx.getBean("auditorium");
        Stage stage = (Stage) ctx.getBean("stage");
        
        try {
            juggler.perform();
            shakespeare.recite();
            poeticJuggler.perform();
                        
            auditorium.turnOnTheLights();
            
            saxo.play();
            saxo2.play();
            instrumentalist.perform();
            instrumentalist.screamSong();
            
            stage.printMessage();
            auditorium.turnOffTheLights();
            
            ticket1.setPerformance("Shakira");
            ticket2.setPerformance("Pitbull");
            ticket1.setPrice(BigDecimal.valueOf(10.99));
            ticket2.setPrice(BigDecimal.valueOf(12.99));
            ticket1.print();
            ticket2.print();
            
            // @Configuration declared beans
            Instrumentalist solo = (Instrumentalist) ctx.getBean("solo");
            Juggler kenny = (Juggler) ctx.getBean("kenny");
            
            solo.perform();
            kenny.perform();

            JukeBox juke = (JukeBox) ctx.getBean("jukeBox");
            juke.play("Viva la viva, viva Italia", "Lala Vivala");
            
        } catch (PerformanceException e) {
            System.err.println("Something bad has happend: " + e.getMessage());
        }
    }
}
