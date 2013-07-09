package competition.autodiscovery;

import org.springframework.stereotype.Component;

/**
 *
 * @author the-ramones
 */
@Component
public class JukeBox {

    public void play(String title, String song) {
        System.out.println("JukeBox is starting to play " + song + " : " + title);
    }
}
