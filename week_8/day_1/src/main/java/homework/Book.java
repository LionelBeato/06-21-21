package homework;

public class Book {

    private String title;
    private String author;
    private String genre;
    private String publishDate;
    private boolean isRented;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public Book(String title, String author, String genre, String publishDate, boolean isRented) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishDate = publishDate;
        this.isRented = isRented;
    }

    public Book(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}
