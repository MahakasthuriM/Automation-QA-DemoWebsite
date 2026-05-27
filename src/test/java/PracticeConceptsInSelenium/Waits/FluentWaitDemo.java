package PracticeConceptsInSelenium.Waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitDemo {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        Wait<WebDriver> myWait=new FluentWait<WebDriver>(d)
                .withTimeout(Duration.ofSeconds(20))
                        .pollingEvery(Duration.ofSeconds(4))
                                .ignoring(NoSuchElementException.class);

        d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        d.manage().window().maximize();

        //d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        WebElement userName=myWait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver d) {
                return d.findElement(By.xpath("//input[@name='username']"));
            }
        });
        userName.sendKeys("Admin");
        d.quit();
    }
}
