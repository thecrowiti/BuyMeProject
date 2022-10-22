import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

public class MainCaller {

    private static WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = ChromeDriverSingelton.chromeCaller();
        driver.get("https://buyme.co.il/");
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(8));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

//    @Test
//    public void itiHelp(){
//        List <WebElement> a = driver.findElements(By.cssSelector("il[value='1']"));
//        System.out.println(a.size());
//    }

    @Test
    public void login(){
        LoginAndRegister homePage = new LoginAndRegister();
//        homePage.register();
        homePage.login();
    }

    @Test
    public void search(){
        HomePage homePage = new HomePage();
        try{
            homePage.searchDetails();
        }catch (Exception e){

        }
    }
    @Test
    public void dealPage(){
        HomePage homePage = new HomePage();
        homePage.chooseADeal();
    }
}
