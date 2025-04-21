package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    @FindBy(id = "nameofuser")
    WebElement nameOfUser_id;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setNameOfUserVerification_id(String name) {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(nameOfUser_id));
        nameOfUser_id.sendKeys(name);
        assert nameOfUser_id.getText().equals(name);
    }
}

