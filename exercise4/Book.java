package exercise4;

import java.util.Objects;

/**
 * Represents a book with details such as name, author, ISBN, and year of issue.
 */
public class Book {
    private String bookName;
    private String author;
    private String ISBN;
    private Integer yearOfIssue;
    public Book(String bookName, String author, String ISBN, Integer yearOfIssue){
        this.bookName = bookName;
        this.author = author;
        this.ISBN = ISBN;
        this.yearOfIssue = yearOfIssue;
    }

    /**
     * Gets the name of the book.
     *
     * @return the name of the book.
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * Gets the author of the book.
     *
     * @return the author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the ISBN of the book.
     *
     * @return the ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Gets the year the book was issued.
     *
     * @return the year of issue of the book.
     */
    public Integer getYearOfIssue() {
        return yearOfIssue;
    }   

    /**
     * Returns a string representation of the book, including its name, author, ISBN, and year of issue.
     *
     * @return a string representation of the book.
     */
    @Override
    public String toString() {
        return "Book:" + bookName + " " + author + " " + ", ISBM:" + ISBN + " " + yearOfIssue;
    }

    /**
     * Compares this book to another object for equality. Two books are considered equal if they have the same
     * name, author, ISBN, and year of issue.
     *
     * @param o the object to compare with this book.
     * @return {@code true} if the books are equal, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o ) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        return Objects.equals(getBookName(), book.getBookName()) &&
               Objects.equals(getAuthor(), book.getAuthor()) &&
               Objects.equals(getISBN(), book.getISBN()) &&
               Objects.equals(getYearOfIssue(), book.getYearOfIssue());
    }
}
