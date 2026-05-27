package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import UtilityClass.*;
import java.time.Duration;

public class loginTest extends BaseClass {


  public static void main(String args[]) throws InterruptedException {

    BaseClass.setup();
    //WebDriver d1=BaseClass.d;

    loginPage n=new loginPage(d);
      //Declaration of Explicit Wait

    //d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    d.manage().window().maximize();
    Thread.sleep(2000);
    //loginWithEmptyInput("Admin","");
    loginWithInValidCredentials("Admin","1234");
    //BaseClass.tearDown();

  }
  public static void loginWithEmptyInput(String a, String b){
   loginPage n=new loginPage(d);
    n.login(a,b);
    if((n.requiredError()).isDisplayed()){
      System.out.println("Required Error");
    }
  }
  public static void loginWithInValidCredentials(String a, String b) throws InterruptedException {
    loginPage n = new loginPage(d);
    n.login(a, b);
    WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(5));

   /* WebElement ele=w.until(ExpectedConditions.visibilityOf(n.invalidError()));
    if(ele.isDisplayed()){
      System.out.println("Invalid Error");
    }
    else
      System.out.println("Error not found yet");
  */
  }


}
