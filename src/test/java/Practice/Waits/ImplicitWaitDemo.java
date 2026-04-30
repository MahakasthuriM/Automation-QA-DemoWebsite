package Practice.Waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitDemo {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        d.manage().window().maximize();
        d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    }
}
