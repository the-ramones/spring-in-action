package competition.aop.annotation;

import org.springframework.stereotype.Component;

/**
 *
 * @author paul
 */
@Component
public class Juggler implements Performer {

    private Integer beanBags = 3;

    public Juggler() {
    }

    public Integer getBeanBags() {
        return beanBags;
    }

    public Juggler(Integer beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() {
        //TODO: put real business logic here
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
