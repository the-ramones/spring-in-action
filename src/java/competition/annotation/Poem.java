package competition.annotation;

/**
 *
 * @author paul
 */
public class Poem {

    public Poem() {
    }
    private String title = "";
    private String author = "";
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
        if (content != null) {
            for (int i = 0; i < content.length; i++) {
                System.out.println(content[i]);
            }
        }
    }
}
