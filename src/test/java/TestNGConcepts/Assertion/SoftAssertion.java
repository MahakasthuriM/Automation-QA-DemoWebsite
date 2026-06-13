package TestNGConcepts.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.reporters.jq.ResultsByClass;

public class SoftAssertion {
    @Test

    void softAssert(){
        SoftAssert sa=new SoftAssert();
        System.out.println("Test-start");
        sa.assertEquals(1,2);
        sa.assertTrue(false);
        System.out.println("Test-end");
        sa.assertAll();


       /* Results
        Test-start
        Test-end

        java.lang.AssertionError: The following asserts failed:
        expected [2] but found [1],
        expected [true] but found [false]*/

    }
}
