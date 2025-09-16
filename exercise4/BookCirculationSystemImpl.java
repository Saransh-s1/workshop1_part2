package exercise4;

public class BookCirculationSystemImpl {
    BookLinkedList bookCirculationSystemBooks;

    public BookCirculationSystemImpl(){
        this.bookCirculationSystemBooks = new BookLinkedList();
    }
    public void addBook(Book book){
        this.bookCirculationSystemBooks.add(book);
    }
    public int count(Book book){
        return this.bookCirculationSystemBooks.count(book);
    }
    public Book getBookByISBN(String isbn){
        return this.bookCirculationSystemBooks.getBookByISBN(isbn);
    }
    public boolean isEmpty(){
        return this.bookCirculationSystemBooks.isEmpty();
    }
    public Book remove(Book book){
        return this.bookCirculationSystemBooks.remove(book);
    }
    public boolean checkForBook(Book book){
        return this.bookCirculationSystemBooks.checkForBook(book);
    }
    public Book ranBookdom(){
        return this.bookCirculationSystemBooks.random();
    }
}
