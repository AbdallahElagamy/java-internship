package models;

public class DVD extends Resource {
    public DVD(String title, String author, int publicationYear) {
        super(title, author, publicationYear);
    }

    @Override
    public String toString() {
        return String.format("DVD{%s}", super.toString());
    }
}
