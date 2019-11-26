package tests.day_03;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class NavigationPractice {
    public static void main(String[] args) {
        //create a webdriver object to work with a browser
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://google.com");

        BrowserUtils.wait(3);

        driver.navigate().to("http://amazon.com");

        System.out.println();
        System.out.println( "Web page title: " + driver.getTitle());

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.quit();
        //we can not call driver.get() after quit driver...
        //driver.get("http://google.com");
    }

}
