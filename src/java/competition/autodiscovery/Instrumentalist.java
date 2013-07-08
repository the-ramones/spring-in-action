package competition.autodiscovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author the-ramones
 */
public class Instrumentalist implements Performer {

    public Instrumentalist() {
    }

    /**
     *
     * @param instrument
     */
    @Autowired(required=false)
    public Instrumentalist(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform()
            throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
    
    @Value("#{settings['twitter.site']}")
    private String song;


    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }
    
    private Instrument instrument;

    @Autowired
    @Qualifier("stringed")
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
