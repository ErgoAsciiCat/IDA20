public class Book {
    private final String title; // titel
    private final String author; // författare
    /** Skapar en bok med författaren author och titeln title */
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    /** Returnerar namnet på författaren */
    public String getAuthor() {
        return author;
    }
    /** Returnerar titeln */
    public String getTitle() {
        return title;
    }
    /** Returnerar en sträng som består av bokens författare och titel */
    public String toString() {
        return author + "\n" + title + "\n" + "~*~*~*~*~*~*~*~*~*~*~*~*~";
    }

    public int compareTo(Book b) {
        int tmp = author.compareTo(b.getAuthor());
        if (tmp == 0) tmp = title.compareTo(b.getTitle());
        return tmp;
    }
}