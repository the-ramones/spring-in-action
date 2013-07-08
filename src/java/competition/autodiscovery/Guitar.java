package competition.autodiscovery;

import competition.annotation.StringedInstrument;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author paul
 */
@Component
//@StringedInstrument
@Qualifier("stringed")
public class Guitar implements Instrument {

    @Override
    public void play() {
        System.out.println("guitar play chords");
    }
}
