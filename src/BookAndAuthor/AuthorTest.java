package BookAndAuthor;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-21.
 */
public class AuthorTest {
    Author author = new Author("Sasha Grey", "sasha.grey@mail.com", 'f');
    @Test
    public void testConstructorNameEmailGender() {

        Assert.assertEquals("Sasha Grey", author.getName());
        Assert.assertEquals("sasha.grey@mail.com", author.getEmail());
        Assert.assertEquals('f', author.getGender());
    }
    @Test
    public void testSetForEmailToAdamPudzianowski(){
        author.setEmail("AdamPudzianowski@gmail.com");
        Assert.assertEquals("AdamPudzianowski@gmail.com", author.getEmail());

    }

}
