package competition.autodiscovery;

import org.springframework.stereotype.Component;

/**
 *
 * @author the-ramones
 */
@Component
public class Prompt {

    public void print(String song, String title) {
        System.out.println(song + " : " + title);
    }
}
