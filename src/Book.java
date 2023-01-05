import java.util.Objects;

public class Book {

    private String bookname;
    private int publishyear;
    private Author author;




    public  Book(String Bookname, int publishyear, Author author) {
        this.bookname = Bookname;
        this.publishyear = publishyear;
        this.author = author;
    }

    public String getbookname() {
        return bookname;
    }

    public void setpublishyear(int publishyear) {
        this.publishyear = publishyear;
    }

    public int getpublishyear() {
        return publishyear;
    }

    @Override
    public String toString() {
        return bookname + ", " + author + ". Год издания:" + publishyear;

    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return publishyear == book.publishyear && Objects.equals(book, book.bookname) && author.equals(book.author);

    }

    @Override
    public int hashCode() {
        return Objects.hash(bookname, publishyear, author);
    }
}


