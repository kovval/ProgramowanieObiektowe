package BookAndAuthor;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-21.
 */
public class BookTest {
    Author tolkien = new Author("Tolkien", "email", 'm');
    Book book = new Book("LotR", tolkien, 23.99);
    @Test
    public void getDefaltgetNameGetAuthorGetPrice(){
        Assert.assertEquals("LotR", book.getName());
        Assert.assertEquals("Tolkien", tolkien.getName());
        Assert.assertEquals(tolkien, book.getAuthor());
    }


}
