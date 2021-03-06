package competition.autodiscovery;

import org.springframework.stereotype.Component;

/**
 *
 * @author the-ramones
 */
@Component
public class Stage {

    public void printMessage() {
        System.out.println(message);
    }
    private String message = "STAGE IS INVOKABLE";

    private Stage() {
    }

    private static class StageSingletonHolder {

        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}