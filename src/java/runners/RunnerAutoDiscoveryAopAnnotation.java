package runners;

import competition.aop.annotation.Audience;
import competition.aop.annotation.Juggler;
import competition.aop.annotation.Magician;
import competition.aop.annotation.Performer;
import competition.aop.annotation.Thinker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author the-ramones
 */
public class RunnerAutoDiscoveryAopAnnotation {
    
    public static void main(String [] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("/web/WEB-INF/applicationContextAutodiscoveryAnnotation.xml");
        
        Performer juggler = (Performer) ctx.getBean(Juggler.class);
        Audience audience = (Audience) ctx.getBean(Audience.class);
        Magician magician = (Magician) ctx.getBean(Magician.class);
        Thinker thinker = (Thinker) ctx.getBean(Thinker.class);
        DataAccessException
//        juggler.perform();
//        audience.applaud();
//        magician.interceptThoughts("Test thoughts");
//        thinker.think("I'm livin' it");
//        thinker.thinkDifferent("I'm lovin' it differently");
        
    }
}
