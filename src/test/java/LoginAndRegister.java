import org.openqa.selenium.By;

public class LoginAndRegister extends ParentPage {

    public void register(){
        // Press login
        clickElement(By.className("notSigned"));
        clickElement(By.cssSelector("span[class='text-link theme']"));
        // Enter user info
        sendkeysToElement(By.cssSelector("input[placeholder='שם פרטי']"),("איתי"));
        sendkeysToElement(By.cssSelector("input[placeholder='מייל']"),("i@gmail.com"));
        sendkeysToElement(By.cssSelector("input[placeholder='סיסמה']"),("alexTheGayBoi123!"));
        sendkeysToElement(By.cssSelector("input[placeholder='אימות סיסמה']"),("alexTheGayBoi123!"));
        // Trying to fine locator and don't understand why it's fails
//        clickElement(By.cssSelector("span[text='אני מסכימ/ה']"));
//        clickElement(By.linkText("אני מסכימ/ה "));
//        clickElement(By.className("ember-view bm-checkbox"));
        // Press the checkbox
        clickElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/div[2]/div[3]/form/div[5]/div"));
        // Press finish
        clickElement(By.cssSelector("button[gtm='הרשמה ל-BUYME']"));
    }
    
    public void login(){
        clickElement(By.className("notSigned"));
        sendkeysToElement(By.cssSelector("input[placeholder='מייל']"),("i@gmail.com"));
        sendkeysToElement(By.cssSelector("input[placeholder='סיסמה']"),("alexTheGayBoi123!"));
        clickElement(By.cssSelector("button[gtm='כניסה ל-BUYME']"));
    }
}
