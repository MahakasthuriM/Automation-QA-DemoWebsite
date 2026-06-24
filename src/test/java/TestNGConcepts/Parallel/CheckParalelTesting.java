package TestNGConcepts.Parallel;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.sql.DriverManager;
import java.time.Duration;

public class CheckParalelTesting {

    WebDriver d;

    @BeforeClass
    @Parameters({"browser"})
    public void setup(String B) {
        switch (B.toLowerCase()) {
            case "chrome":
                d = new ChromeDriver();
                break;
            case "edge": {
                d =new EdgeDriver();
                break;
            }
            case "firefox": {

                d = new FirefoxDriver();
                break;
            }
            default:
                System.out.println("Invalid Browser");
                return;
        }
    }

    @Test

    public void launch() {
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        d.get("https://www.youtube.com");
    }


    @AfterClass
    public void tearDown() {
        d.quit();
    }
}
