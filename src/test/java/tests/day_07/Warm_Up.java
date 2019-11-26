package tests.day_07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

import java.util.List;

public class Warm_Up {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://cybertekschool.com/");
        //every link as a tag name <a>
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        System.out.println("Number of links: " + links.size());
        System.out.println("FOR EACH LOOP");
        for(WebElement webElement: links){
            System.out.println(webElement.getText());
        }
        System.out.println("FOR LOOP");
        for(int i=0; i<links.size();i++){
            System.out.println(links.get(i).getText());
        }

        driver.quit();
    }

}
