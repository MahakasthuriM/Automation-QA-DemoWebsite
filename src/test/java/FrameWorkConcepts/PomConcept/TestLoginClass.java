package FrameWorkConcepts.PomConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class TestLoginClass {

     WebDriver d;
    @BeforeMethod
    public void setup(){
        d=new ChromeDriver();
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 1)
    public void testLogin1(){
        LoginPageWithoutPageFactory l1=new LoginPageWithoutPageFactory(d);
        l1.setUserName("Admin");
        l1.setPassword("admin123");
        l1.clickLogin();
    }

    @Test(priority = 2)
    public void testLogin2(){
        LoginPageWithPageFactory l1=new LoginPageWithPageFactory(d);
        l1.setUserName("Admin");
        l1.setPassword("admin123");
        l1.clickLogin();
        Assert.assertEquals(d.getTitle(),"OrangeHRM");
    }

    @AfterMethod
    public void tearDown(){
        d.quit();
    }

}
