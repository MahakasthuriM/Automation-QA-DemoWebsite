package TestNGConcepts.depencyMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependOnMethodConcept {

    @Test
    void openApp(){
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = {"openApp"},priority = 1)
    void login(){
        Assert.assertTrue(true);
    }
    @Test(priority = 2)
    void search(){
        Assert.assertTrue(true);
    }
    @Test(priority =3,dependsOnMethods = {"login"})
    void advSearch(){
        Assert.assertTrue(true);
    }

    @Test(priority = 4)
    void logout(){
        Assert.assertTrue(true);
    }
}
