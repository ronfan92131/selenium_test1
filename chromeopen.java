package test1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chromeopen {

    @Test
    public void WebDriver() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.yahoo.com");
        Thread.sleep(1000);
        driver.close();

    }

}
