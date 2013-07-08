package competition.autodiscovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author paul
 */
@Component("shakespeare-poem")
@Qualifier("plain")
public class Poem {

    public Poem() {
    }
    @Value("La Figaro")
    private String title;
    @Value("W. Shakespeare")
    private String author;
    @Value("La-la-la")
    private String[] content = null;

    public Poem(String author, String title) {
        if (author != null && title != null) {
            this.author = author;
            this.title = title;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String[] getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String[] content) {
        this.content = content;
    }

    public void recite() {
        //TODO: place real business logic here
        System.out.println("Recite \"" + this.title + "\" of " + this.author);
//        if (content != null) {
//            for (int i = 0; i < content.length; i++) {
//                System.out.println(content[i]);
//            }
//        }
    }
}
