package FrameWorkConcepts.PomConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {

    WebDriver d;

    LoginPageWithPageFactory(WebDriver d){
        this.d=d;
        PageFactory.initElements(d,this); //Mandatory
    }

    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement f_userName;

    @FindBy(xpath="//input[@name=\"password\"]")
    WebElement f_passWord;

    @FindBy(xpath="//button[@type=\"submit\"]")
    WebElement f_login;


    public void setUserName(String name){
        f_userName.sendKeys(name);
    }

    public void setPassword(String password){
        f_passWord.sendKeys(password);
    }

    public void clickLogin(){f_login.click();
    }



}
