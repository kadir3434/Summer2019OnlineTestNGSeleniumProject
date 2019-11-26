package tests.day_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        // to maximize browser
        driver.manage().window().maximize();
        driver.get("https://google.com");

        //we want to navigate to the different page
        //within same browser
        //we not gonna open new browser or new tab
        //URL can be as an object
        driver.navigate().to("http://amazon.com");
        String actualResult = driver.getTitle();
        System.out.println(actualResult);
        //if I come back to the previous page
        driver.navigate().back();
        //if I want to know URL of curent website
        String url = driver.getCurrentUrl();
        System.out.println(url);


        driver.close();
    }

}
