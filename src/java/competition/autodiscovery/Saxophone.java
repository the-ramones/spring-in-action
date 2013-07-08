package competition.autodiscovery;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author the-ramones
 */
@Component("saxo")
public class Saxophone implements Instrument {

    public Saxophone() {
        super();
    }

    @Override
    public void play() {
        System.out.println("PLAYING SAXO SONG : " + this);
    }
}
