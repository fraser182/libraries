import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void setUp(){
        library = new Library(3);
        book1 = new Book("Treasure Island", "Robert Louis Stevenson", "adventure");
        book2 = new Book( "The Lord Of The Rings", "JRR Tolkien", "fantasy");
        book3 = new Book("Harry Potter and the Goblet of Fire", "JK Rowling", "fantasy");
        book4 = new Book("To Kill a Mockingbird", "Harper Lee", "Southern Gothic");
    }

    @Test
    public void numberOfBooksInLibrary() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary() {
        library.add(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkCapacityIsFull() {
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void lendBook() {
        library.add(book1);
        library.add(book2);
        library.lend(book1);
        assertEquals(1, library.bookCount());

    }
}
