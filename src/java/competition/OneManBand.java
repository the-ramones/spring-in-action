package competition;

import java.util.Collection;

/**
 *
 * @author paul
 */
public class OneManBand implements Performer {

    public OneManBand() {
    }
    private Collection<Instrument> instruments;

    @Override
    public void perform() throws PerformanceException {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    public Collection<Instrument> getINstruments() {
        return instruments;
    }
}
