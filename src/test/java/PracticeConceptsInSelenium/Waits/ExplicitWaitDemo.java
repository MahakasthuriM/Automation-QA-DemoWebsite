package PracticeConceptsInSelenium.Waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {
    public static void main(String args[]){
        WebDriverManager.firefoxdriver().setup();
        WebDriver d=new FirefoxDriver();

        //Declaration of Explicit Wait
        WebDriverWait w=new WebDriverWait(d, Duration.ofSeconds(1));

        d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        d.manage().window().maximize();

        //Usage
        //Below statment checks - visibility of Element return true and also it's return the webelement on full exuation
        //No need of FindElement

        WebElement userN=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        userN.sendKeys("Admin");

        //direcly access the webElement
       w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys("admin123");

       w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

    }
}
