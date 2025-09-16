package exercise4;

import java.util.LinkedList;

/**
 * A simple generic implementation of a LinkedList.
 *
 * @param <T> the type of elements in this list.
 */
public class BookLinkedList extends LinkedList<Book> {
    BookLinkedList(){
        super();
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public void addBook(Book book) {
        super.add(book);
    }

    public Book remove(Book book) {
        if(!super.contains(book)){
            throw new IllegalArgumentException("Book not found");
        }
        super.remove(book);
        return book;
    }

    public boolean checkForBook(Book book) {
        return super.contains(book);
    }

    public int count(Book book) {
        int count = 0;
        for (Book b : this) {
            if (b.equals(book)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int size() {
        return super.size();
    }

    public Book random() {
        if (this.isEmpty()) {
            throw new IllegalArgumentException("The list is empty");
        }
        int randomIndex = (int) (Math.random() * this.size());
        return this.get(randomIndex);
    }

    public Book getBookByISBN(String ISBN) {
        for (Book book : this) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        throw new IllegalArgumentException("Book with ISBN " + ISBN + " not found");
    }


}

