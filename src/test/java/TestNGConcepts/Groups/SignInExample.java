package TestNGConcepts.Groups;

import org.testng.annotations.*;

public class SignInExample {
    @Test(groups = {"Sanity"})
    void SignInByEmail(){
        System.out.println("Sign in by email.....");
    }
    @Test(priority = 1,groups = {"Regression"})
    void SignInByFacebook(){
        System.out.println("Sign in by facebook.....");
    }
    @Test(priority =2,groups = {"Regression"})
    void SignInByTwitter(){
        System.out.println("Sign in by Twitter....");
    }
}
