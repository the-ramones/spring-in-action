package competition.autodiscovery;

import org.springframework.stereotype.Component;

/**
 *
 * @author the-ramones
 */
@Component
public class Financier implements Finansable {

    @Override
    public void doAccounting() {
        System.out.println(this + " is doing accounting");
    }
}
