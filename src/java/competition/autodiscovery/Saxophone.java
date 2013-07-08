package competition.autodiscovery;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author the-ramones
 */
@Qualifier("stringed")
public class Saxophone implements Instrument {

    public Saxophone() {
        super();
    }

    @Override
    public void play() {
        System.out.println("PLAYING SAXO SONG : " + this);
    }
}
