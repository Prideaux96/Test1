import org.junit.Assert;
import org.junit.Test;



public class MainClassTest
{
    @Test
    public void testGetLocalNumber()
    {
        MainClass test = new MainClass();
        int result = test.getLocalNumber();
        Assert.assertEquals("getLocalNumber != 14" ,13, result);

    }
}
