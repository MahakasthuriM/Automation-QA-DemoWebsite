package PracticeLoginFlow.UtilityClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
   public static WebDriver d;

    public static void setup(){
        WebDriverManager.firefoxdriver().setup();
         d=new FirefoxDriver();
    }

    public static void tearDown() {
        d.close();
    }
}
