package competition.autodiscovery;

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
public class AutodiscoveryConfigutationTest {

    private static ApplicationContext ctx;

    public AutodiscoveryConfigutationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        ctx = new FileSystemXmlApplicationContext("/web/WEB-INF/applicationContextAutodiscovery.xml");
    }

    @Test
    public void AutodiscoveryCoreTest() throws PerformanceException {
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

        assertNotNull(juggler);
        juggler.perform();

        assertNotNull(shakespeare);
        shakespeare.recite();

        assertNotNull(poeticJuggler);
        poeticJuggler.perform();

        assertNotNull(auditorium);
        auditorium.turnOnTheLights();
        assertEquals(auditorium.getLight(), Auditorium.State.ON);

        assertNotNull(saxo);
        assertSame(saxo, saxo2);
        saxo.play();
        saxo2.play();

        assertNotNull(instrumentalist);
        assertSame(instrumentalist, instrumentalist2);
        instrumentalist.perform();
        instrumentalist.screamSong();

        stage.printMessage();
        auditorium.turnOffTheLights();
        assertEquals(auditorium.getLight(), Auditorium.State.OFF);

        assertNotNull(ticket1);
        assertNotNull(ticket2);
        ticket1.setPerformance("Shakira");
        ticket2.setPerformance("Pitbull");
        ticket1.setPrice(BigDecimal.valueOf(10.99));
        ticket2.setPrice(BigDecimal.valueOf(12.99));

        assertNotSame(ticket1, ticket2);
        ticket1.print();
        ticket2.print();

        // @Configuration declared beans
        Instrumentalist solo = (Instrumentalist) ctx.getBean("solo");
        Juggler kenny = (Juggler) ctx.getBean("kenny");

        assertNotNull(solo);
        assertNotNull(kenny);
        
        solo.perform();
        kenny.perform();
        
    }
}