import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverSingelton {
    private static WebDriver driver;

    public static WebDriver chromeCaller(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", Constants.ChromeDriver_Path);
            driver = new ChromeDriver();
        }
        return driver;
    }
}
