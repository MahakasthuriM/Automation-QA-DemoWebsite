package TestNGConcepts.Groups;
import TestNGConcepts.DataProvider.DP1;
import org.testng.annotations.*;

@Test(groups = "all")
public class loginExample {

    @Test(priority = 1,groups = {"Sanity"},dataProvider = "DP1-data",dataProviderClass = DP1.class)

    void loginByEmail(String s){

        System.out.println(s+ "login by email.....");
    }

    @Test(priority = 2,groups = {"Regression"})
    void loginByFacebook(){
        System.out.println("login by facebook.....");
    }

    @Test(priority = 3,groups = {"Regression"})
    void loginByTwitter(){
        System.out.println("login by Twitter.....");
    }
    @Test
    void Test1(){
        System.out.print("NO Group");
    }

}
