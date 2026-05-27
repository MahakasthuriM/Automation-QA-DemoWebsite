package PracticeLoginFlow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    WebDriver d;
    public loginPage(WebDriver d){
        this.d=d;
    }
    By username= By.xpath("//input[@name='username']");
    By Password=By.xpath("//input[@name='password']");
    By login=By.xpath("//button[@type='submit']");
    By required=By.xpath("//div/span[text()='Required']");

    public void login(String userName, String passWord){
        d.findElement(username).sendKeys(userName);
        d.findElement(Password).sendKeys(passWord);
        d.findElement(login).click();

    }
    public WebElement requiredError(){
        return d.findElement(required);
    }

   /* public WebElement invalidError(){
        return d.findElement(inValidError);
    }*/



}
