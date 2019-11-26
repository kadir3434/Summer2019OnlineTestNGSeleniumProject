package tests.day_07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

import java.util.List;

public class CssSelectorPractice {
    public static void main(String[] args) {

        //Which locator to use?
        //#1 id
        //#2 css
        //#3 xpath
        //## whatever
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        //let's fin all buttons, and click on them one by one
        // why I put . instead of space? because it's 2 class names .btn.btn-primary
        //in this case, we will find all buttons that have: class="btn btn-primary"
        // or like this [class='btn btn-primary'], no need for .
        //. means class name
        //# means id
        List<WebElement> buttons = driver.findElements(By.cssSelector(".btn.btn-primary"));
        for(WebElement button: buttons){
            button.click();
            BrowserUtils.wait(2);
            WebElement message = driver.findElement(By.cssSelector("#result"));
            System.out.println(message.getText());
        }
        driver.quit();
    }
}
