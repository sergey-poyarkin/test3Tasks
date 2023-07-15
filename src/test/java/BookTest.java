import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book testBook = new Book("testName", "test", 2023, 2, "test ");

    @Test
    void up() {
        int expect = 3;

        testBook.up();

        int result = testBook.rating;
        Assertions.assertEquals(expect, result);

    }

    @Test
    void down() {
        int expect = 1;

        testBook.down();

        int result = testBook.rating;
        Assertions.assertEquals(expect, result);
    }

    @Test
    void append() {
        String str = "for append";

        String expect = "test for append";

        testBook.append(str);

        testBook.textOfBook.equals(expect);
    }
}