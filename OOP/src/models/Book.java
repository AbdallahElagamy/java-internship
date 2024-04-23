package models;

public class Book extends Resource {
    public Book(String title, String author, int publicationYear) {
        super(title, author, publicationYear);
    }

    @Override
    public String toString() {
        return String.format("Book{%s}", super.toString());
    }
}
