package competition;

import java.util.Map;

/**
 *
 * @author paul
 */
public class OneManBandMap implements Performer {

    public OneManBandMap() {
    }
    private Map<String, Instrument> instruments;

    @Override
    public void perform() throws PerformanceException {
        for (String instrument : instruments.keySet()) {
            instruments.get(instrument).play();
        }
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    public Map<String, Instrument> getINstruments() {
        return instruments;
    }
}
