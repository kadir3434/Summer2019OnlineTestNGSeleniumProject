package tests.day_03;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferenceBetweenQuitAndClose {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(4000); //will pause execution for 4 seconds
        //driver.get("http://practice.cybertekschool.com/open_new_tab");
        //Thread.sleep(4000);
        driver.close();
        //Thread.sleep(4000);
        //driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(4000);
        driver.quit();


    }


}
