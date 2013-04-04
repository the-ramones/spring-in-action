package runners;

import competition.Auditorium;
import competition.Instrumentalist;
import competition.PerformanceException;
import competition.Performer;
import competition.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author paul
 */
public class Runner {

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("/web/WEB-INF/applicationContext.xml");

        //TODO: figure it out, quitter
        // You firmly must pul your application-ciontexts XML files into /WEB_INF/classes directory 
        // for appropriate locations inside war-file that is load to the web-server (Apache, JBoss)
        // classpath:applicationContext.xml - has been tested, work
        // classpath*:applicationContext.xml - has been tested, work
        // applicationContext.xml - has been tested, work
        // ApplicationContext ctx2 = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");


        Performer j = (Performer) ctx.getBean("juggler");
        Performer pj = (Performer) ctx.getBean("poetic-juggler");
        Stage s = (Stage) ctx.getBean("stage");
        Auditorium a = (Auditorium) ctx.getBean("auditorium");
        Performer i = (Performer) ctx.getBean("kenny");
        Performer i2 = (Performer) ctx.getBean("kenny2");
        
        try {
            j.perform();
            pj.perform();
            s.printMessage();
            a.lightsState();            
            i.perform();
            i2.perform();
                    
        } catch (PerformanceException e) {
            System.err.println("Something bad has happend: " + e.getMessage());
        }
    }
}
