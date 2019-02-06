import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void setUp() {
        borrower = new Borrower ("Alistair");
        book = new Book("Treasure Island", "Robert Louis Stevenson", "adventure");
    }


    @Test
    public void startWithNoBooksBorrowed() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canAddABookToBorrowedCollection(){
        borrower.add(book);
        assertEquals(1, borrower.bookCount());
    }

//    @Test
//    public void canBorrowABookFromTheLibrary() {
//        // remove book from libraryStockList
//        borrower.removeBookFromLibrary(library);
//        assertEquals();
//        // add book to borrowerCollection
//        borrower.add(book);
//    }


//    @Test
//    public void bellyEmptiesWhenSleeping() {
//        bear.eatSalmonFromRiver(river);
//        bear.sleep();
//        assertEquals(0, bear.foodCount());
//    }

}
