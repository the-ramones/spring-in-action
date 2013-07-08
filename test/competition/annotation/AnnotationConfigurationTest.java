package competition.annotation;

import java.math.BigDecimal;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import static org.junit.Assert.*;

/**
 *
 * @author the-ramones
 */
public class AnnotationConfigurationTest {

    private static ApplicationContext ctx;

    @BeforeClass
    public static void setUpClass() {
        ctx = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContextAnnotation.xml");
    }

    public AnnotationConfigurationTest() {
    }

    @Test
    public void AnnotationCoreTest() throws PerformanceException {
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
        Performer hank = (Performer) ctx.getBean("Hank");
        Performer hank2 = (Performer) ctx.getBean("map-hank");
        Performer hank3 = (Performer) ctx.getBean("prop-hank");

        // Autowiring
        Performer tenny = (Performer) ctx.getBean("tenny");

        juggler.perform();
        shakespeare.recite();
        poeticJuggler.perform();
        saxo.play();
        
        auditorium.turnOnTheLights();
        assertEquals(auditorium.getLight(), Auditorium.State.ON);
        
        kenny.perform();
        kenny2.perform();
        assertNotSame(kenny, kenny2);
        
        auditorium.turnOffTheLights();
        assertEquals(auditorium.getLight(), Auditorium.State.OFF);
        
        t1.setPerformance("Shakira");
        t2.setPerformance("Pitbull");
        t1.setPrice(BigDecimal.valueOf(10.99));
        t2.setPrice(BigDecimal.valueOf(12.99));
        t1.print();
        t2.print();
        assertNotSame(t1, t2);

        jenny.perform();
        hank.perform();
        hank2.perform();
        hank3.perform();

        // Autowiring
        tenny.perform();
    }
}