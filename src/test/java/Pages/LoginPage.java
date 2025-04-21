package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    @FindBy(id = "login2")
    WebElement initialLogin_id;
    @FindBy(id = "loginusername")
    WebElement enterUsername_id;
    @FindBy(id = "loginpassword")
    WebElement enterPassword_id;
    @FindBy(xpath ="/html/body/div[3]/div/div/div[3]/button[2]" )
    WebElement loginBtn_id;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickIntLogin() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(initialLogin_id));
        initialLogin_id.click();
    }

    public void setEnterUsername_id(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(enterUsername_id));
        enterUsername_id.sendKeys(username);
    }

    public void setEnterPassword_id(String password) {
        enterPassword_id.sendKeys(password);
    }
    public void clickLoginBtn_id() {
        loginBtn_id.click();
    }


}
