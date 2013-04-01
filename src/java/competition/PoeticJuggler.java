package competition;

import java.text.MessageFormat;

/**
 *
 * @author paul
 */
public class PoeticJuggler extends Juggler {

    private Poem poem;

    public PoeticJuggler(Integer beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() {
        //TODO: put real business logic here
        String pattern = "JUGGLING {0} BEANBAGS WHILE RECITING \"{1}\" of {2}";
        String format = MessageFormat.format(pattern, getBeanBags(), poem.getTitle(), poem.getAuthor());
        System.out.println(format);
    }

    public Poem getPoem() {
        return poem;
    }
}
