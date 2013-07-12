package competition.aop.annotation;

import org.springframework.stereotype.Component;

/**
 *
 * @author the-ramones
 */
@Component
public class Thinker {

    public void think(String thoughts) {
        System.out.println("Thinking of " + thoughts);
    }
    
    public void thinkDifferent(String thoughts) {
        System.out.println("Thinking different of" + thoughts);
    }
}
