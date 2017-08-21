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
    @Test
    public void toStringtestForauthorwithoutsetemail(){
        Assert.assertEquals("Author[name = Sasha Grey email= sasha.grey@mail.com, gender= f]", author.toString());
    }
    @Test
    public void toStringtestWithsetEmailkovval() {
        author.setEmail("kovval");
        Assert.assertEquals("Author[name = Sasha Grey email= kovval, gender= f]", author.toString());
    }
    }


