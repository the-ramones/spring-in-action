package competition.annotation;

import java.lang.reflect.Field;
import java.util.logging.Logger;

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
