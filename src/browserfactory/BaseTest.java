package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public void openBrowser(String baseUrl){
        driver = new ChromeDriver();
        //Launch Url
        driver.get(baseUrl);
        //Maximise the Window
        driver.manage().window().maximize();
        //Implicit timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBrowser(){
        //Close the Browser
        //driver.close();
    }
}

