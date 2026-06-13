package PracticeConceptsInSelenium.HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropdown {
    public static void main(String []args){
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();

        d.get("https://testautomationpractice.blogspot.com/");

        WebElement Country_field= d.findElement(By.id("country"));

        Select s=new Select(Country_field);
        //s.selectByVisibleText("India");
        //s.selectByValue("india");
        //s.selectByIndex(9);

        //getAll options from dropdown

        List<WebElement> allOption=s.getOptions();
        for(WebElement i:allOption){
           System.out.println(i.getText());
        }



    }

}
