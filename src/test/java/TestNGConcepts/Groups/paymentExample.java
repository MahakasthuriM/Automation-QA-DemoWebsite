package TestNGConcepts.Groups;

import org.testng.annotations.*;

public class paymentExample {
    @Test(priority = 1,groups = {"Sanity","Regression"})
    void paymentViaCash(){
        System.out.println("Cash payment.....");
    }
    @Test(priority = 2,groups = {"Regression"})
    void paymentViaUPI(){
        System.out.println("UPI payment.....");
    }
}
