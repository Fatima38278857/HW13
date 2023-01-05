import java.util.Objects;

public class Author {

    private String namefirst;
    private String namelast;


    public Author(String namefirst, String namelast) {
        this.namefirst = namefirst;
        this.namelast = namelast;

    }

    public String getnamefirst() {
        return namefirst;
    }

    public String getnamelast() {
        return namelast;
    }

    public String toString() {
        return " " + namelast;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return Objects.equals(namefirst, author.namefirst) && Objects.equals(namelast, author.namelast);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namefirst, namelast);

    }
}












