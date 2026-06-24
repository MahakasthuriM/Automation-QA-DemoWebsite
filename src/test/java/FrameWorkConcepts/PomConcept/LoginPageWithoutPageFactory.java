package FrameWorkConcepts.PomConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageWithoutPageFactory {

    WebDriver d;

    LoginPageWithoutPageFactory(WebDriver d){
        this.d=d;}

    By f_userName=By.xpath("//input[@name=\"username\"]");
    By f_passWord=By.xpath("//input[@name=\"password\"]");
    By f_login=By.xpath("//button[@type=\"submit\"]");

    public void setUserName(String name){
        d.findElement(f_userName).sendKeys(name);
    }

    public void setPassword(String password){
        d.findElement(f_passWord).sendKeys(password);
    }

    public void clickLogin(){
        d.findElement(f_login).click();
    }



}
