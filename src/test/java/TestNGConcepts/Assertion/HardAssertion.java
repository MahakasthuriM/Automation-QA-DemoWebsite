package TestNGConcepts.Assertion;
import net.bytebuddy.asm.Advice;
import org.testng.Assert;
import org.testng.annotations.*;

public class HardAssertion {

    @Test
    void test_AllAssertionTrue(){
        Assert.assertEquals("A","A"); //both input should be same
        Assert.assertNotEquals("A","B"); //both should not be same
        Assert.assertTrue(true);   //condtion should be always true
        Assert.assertFalse(false); //condtion shold be always false

    }
    @Test
    void test_AllAssertionFasle(){
        Assert.assertEquals("A","B"); //both input should be same
        Assert.assertNotEquals("A","A"); //both should not be same
        Assert.assertTrue(1==2);   //condtion should be always true
        Assert.assertFalse('a'=='a'); //condtion shold be always false

    }



}
