package exercise4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the BookCirculationSystem implementation.
 */
public class testBookCirculationSystem {

    @Test
    public void testAddBookAndRetrieveByISBN() {
        // Arrange
        BookCirculationSystemImpl system = new BookCirculationSystemImpl();
        Book book = new Book("Lord of the Flies", "I Forgot", "123456789", 1925);

        // Act
        system.addBook(book);
        int count = system.count(book);
        Book retrievedBook = system.getBookByISBN("123456789");

        // Assert
        assertEquals(1, count);
        assertNotNull(retrievedBook);
        assertEquals("The Great Gatsby", retrievedBook.getBookName());
    }

    @Test
    public void testGetBookByNonExistentISBN() {
        // Arrange
        BookCirculationSystemImpl system = new BookCirculationSystemImpl();

        // Act
        Book retrievedBook = system.getBookByISBN("987654321");

        // Assert
        assertNull(retrievedBook);
    }
}
