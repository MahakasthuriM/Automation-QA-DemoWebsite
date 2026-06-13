package PracticeConceptsInSelenium.HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleFrames {
    public static void main(String args[]){
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        d.get("https://ui.vision/demo/iframes");

       WebElement ele= d.findElement(By.xpath("//iframe[@src=\" https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true\"]"));
        d.switchTo().frame(ele);
        //d.findElement(By.xpath("//*[text()='Create new topic']")).click();
        d.findElement(By.xpath("//*[@data-value=\"I am a human\"]")).click();


        d.switchTo().defaultContent();

        d.findElement(By.xpath("//div[@id=\"page-header\"]"));


    }
}
