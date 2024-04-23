package models;

import java.util.Objects;

public class Resource {
    private String title;
    private String author;
    private int publicationYear;


    public Resource(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public int getSerialNumber() {
        return hashCode();
    }

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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Resource resource = (Resource) o;
        return this.publicationYear == resource.publicationYear
                && this.title.equals(resource.title)
                && this.author.equals(resource.author);
    }

    @Override
    public String toString() {
        return "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", publicationYear=" + getPublicationYear();
    }
}
