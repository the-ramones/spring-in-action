package runners;

import competition.PerformanceException;
import competition.Performer;
import java.text.MessageFormat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author paul
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("/web/WEB-INF/applicationContext.xml");

        //TODO: figure it out, quitter
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/WEB-INF/applicationContext.xml");

        Performer j = (Performer) ctx.getBean("juggler");
        Performer pj = (Performer) ctx.getBean("poetic-juggler");

        try {
            j.perform();
            pj.perform();
        } catch (PerformanceException e) {
            System.err.println("Something bad has happend: " + e.getMessage());
        }
    }
}
