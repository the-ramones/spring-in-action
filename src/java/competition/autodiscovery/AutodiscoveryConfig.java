package competition.autodiscovery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author the-ramones
 */
@Configuration
@ComponentScan("competition.autodiscovery")
// @ComponentScan("competition.autodiscovery")
public class AutodiscoveryConfig {

    public AutodiscoveryConfig() {
    }

    @Bean
    public Juggler kenny() {
        return new Juggler();
    }

    @Bean
    public Instrumentalist solo() {
        return new Instrumentalist(new Guitar());
    }
}
