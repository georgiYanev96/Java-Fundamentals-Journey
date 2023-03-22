package ObjectsAndClasses.Articles;

public class Article {
    public String title;
    public String content;
    public String author;

    public void edit(String newContent){
        this.content = newContent;
    }
    public void changeAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void rename(String newTitle){
        this.title = newTitle;
    }

   //"{title} - {content}:{author}"
    @Override
    public String toString() {
        return title + " - " + content+ ":" + author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
