import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends ParentPage {

    private WebDriver driver = ChromeDriverSingelton.chromeCaller();
    private Select select;
    public void searchDetails() throws InterruptedException {
        List <WebElement> dropDown = driver.findElements(By.className("selected-text"));
        System.out.println(dropDown.size());
        Thread.sleep(2000);
        dropDown.get(0).click();
        Thread.sleep(500);
        clickElement(By.cssSelector("li[value='1']"));
        Thread.sleep(500);
        dropDown.get(1).click();
        Thread.sleep(500);
        clickElement(By.cssSelector("li[value='11']"));
        Thread.sleep(500);
        dropDown.get(2).click();
        Thread.sleep(500);
        clickElement(By.cssSelector("li[value='423']"));
//        Thread.sleep(5000);
        clickElement(By.xpath("/html/body/div[3]/div/header/div[3]/div/div/form/a"));
    }
    public void chooseADeal(){
        List<WebElement> deal = driver.findElements(By.className("product-card-bg"));
        System.out.println(deal.size());
        deal.get(0).click();
    }

}
