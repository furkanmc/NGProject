package techproed.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Driver {
    /*
    What is Driver ? = Create and initialize the driver instance
    Why ? => Reusability. Avoid duplication
    Faster development
     */
    private static WebDriver driver;
    private Driver(){
    }
    //Create getDriver method to Create and initialize the driver instance
    public static WebDriver getDriver(){
        if (driver==null){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }
    //    closeDriver is used for closing teh driver
    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}