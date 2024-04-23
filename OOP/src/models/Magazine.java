package models;

public class Magazine extends Resource {
    public Magazine(String title, String author, int publicationYear) {
        super(title, author, publicationYear);
    }

    @Override
    public String toString() {
        return String.format("Magazine{%s}", super.toString());
    }
}
