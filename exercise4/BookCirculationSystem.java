package exercise4;

/**
 * Represents a system for managing the circulation of books.
 * Provides methods to add, remove, and query books in the system.
 */
public interface BookCirculationSystem {

    /**
     * Checks if the book circulation system is empty.
     *
     * @return True if the system is empty, False otherwise.
     */
    boolean isEmpty();

    /**
     * Adds a book to the circulation system.
     *
     * @param book the book to be added.
     */
    void addBook(Book book);

    /**
     * Removes a specific book from the circulation system.
     *
     * @param book the book to be removed.
     * @return the removed book, or Exception if the book was not found.
     */
    Book remove(Book book);

    /**
     * Checks if a specific book exists in the circulation system.
     *
     * @param book the book to check for.
     * @return {@code true} if the book exists, False otherwise.
     */
    boolean checkForBook(Book book);

    /**
     * Counts the number of copies of a specific book in the circulation system.
     *
     * @param book the book to count.
     * @return the number of copies of the book.
     */
    int count(Book book);

    /**
     * Gets the total number of books in the circulation system.
     *
     * @return the total number of books.
     */
    int size();

    /**
     * Retrieves a random book from the circulation system.
     *
     * @return a random book, or Exception if the system is empty.
     */
    Book random();

    /**
     * Retrieves a book from the circulation system by its ISBN.
     *
     * @param ISBN the ISBN of the book to retrieve.
     * @return the book with the specified ISBN, or Exception if not found.
     */
    Book getBookByISBN(String ISBN);
}