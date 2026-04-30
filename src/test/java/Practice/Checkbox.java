package Practice;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://testautomationpractice.blogspot.com/");

        //Selecting single check box
       /*WebElement checkBox_sunday =d.findElement(By.xpath("//input[@id=\"sunday\"]"));
        checkBox_sunday.click();
        System.out.println(checkBox_sunday.isSelected());*/
//-------------------------------------------------------------------\\
        //-->,Multiple Checkboxes
        List<WebElement> l =d.findElements(By.xpath("//input[@class ='form-check-input' and @type='checkbox']"));

        //1-->>Selecting all checkboxes
        /*for(WebElement i:l){
            //System.out.println(i.getAttribute("value"));
             i.click();}
*/
        //2-->>Selecting checkboxes based on the input value
        String[] s={"Monday","Wednesday"};
        for(WebElement j:l){
            for(String a:s) {
                if (j.getAttribute("value").equalsIgnoreCase(a))
                    j.click();
            }}

        //3--> selecting last n number of checkboxes
        /*int last=3;
        int totalCheckBox =l.size();
        for(int i=(totalCheckBox-last);i<totalCheckBox;i++)
             l.get(i).click();
*/
        //4--> selecting first 3 checkboxes
       /* int first =3;
        for (int i=0;i<first;i++)
            l.get(i).click();
*/
       //5-->>alternate days select
      /*  for (int i=0;i<l.size();i=i+2)
            l.get(i).click();

      */
        //6---> Unselect checkboxes which are selected
        for(WebElement w:l){
            if(w.isSelected()){
                System.out.println(w.getAttribute("value"));
                w.click();
            }

        }

       // d.quit();



    }
}
