package competition.annotation;

/**
 *
 * @author the-ramones
 */
public class Saxophone implements Instrument {

    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.println("PLAYING SAXO SONG : " + this);
    }
}
