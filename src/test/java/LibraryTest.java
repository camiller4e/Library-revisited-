import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Book Who's Talking", 10);
        book = new Book("The Name of the Wind", "Patrick Rothfuss", "Fantasy");
    }

    @Test
    public void canAddBooks(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }
}
