package competition.autodiscovery;

import org.springframework.stereotype.Component;

/**
 *
 * @author the-ramones
 */
@Component
public class Manager implements SelfManaged {

    @Override
    public void organize() {
        System.out.println(this + " has organized your self");
    }
}
