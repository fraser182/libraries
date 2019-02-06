import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;


    @Before
    public void before() {
        book = new Book("Treasure Island", "Robert Louis Stevenson", "adventure");

    }

    @Test
    public void hasName() {
        assertEquals("Treasure Island", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Robert Louis Stevenson", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("adventure", book.getGenre());
    }

}
