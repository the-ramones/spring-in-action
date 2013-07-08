package competition.autodiscovery;

import org.springframework.stereotype.Component;

/**
 *
 * @author the-ramones
 */
@Component
public class JukeBox {

    public void play(String song, String title) {
        System.out.println("JukeBox is starting to play " + song + " : " + title);
    }
}
