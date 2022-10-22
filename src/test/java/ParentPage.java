import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class ParentPage {
    public void clickElement(By locator){
        getWebElement(locator).click();
    }

    public void sendkeysToElement(By locator, String  text){
        getWebElement(locator).sendKeys(text);
    }

    private WebElement getWebElement(By locator){
        try{
            return ChromeDriverSingelton.chromeCaller().findElement(locator);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
