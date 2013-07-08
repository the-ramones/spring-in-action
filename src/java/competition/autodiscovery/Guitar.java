package competition.autodiscovery;

import competition.annotation.Instrument;
import competition.annotation.custom.StringedInstrument;

/**
 *
 * @author paul
 */
@StringedInstrument
public class Guitar implements Instrument {

    @Override
    public void play() {
        System.out.println("guitar play chords");
    }
}
