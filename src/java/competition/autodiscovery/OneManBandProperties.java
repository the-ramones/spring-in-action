package competition.autodiscovery;

import java.util.Enumeration;
import java.util.Properties;

/**
 *
 * @author paul
 */
public class OneManBandProperties implements Performer {

    public OneManBandProperties() {
    }
    private Properties instruments;

    @Override
    public void perform() throws PerformanceException {
        Enumeration<String> en = (Enumeration<String>) instruments.propertyNames();
        String elem = null;
        String key = null;
        while (en.hasMoreElements()) {
            key = en.nextElement();
            elem = instruments.getProperty(key);
            System.out.println(elem + " PLAYING " + key);
        }
    }

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }

    public Properties getINstruments() {
        return instruments;
    }
}
