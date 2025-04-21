package Tests;

import Utils.ReadFromExcel;
import Utils.TakeScreenShots;
import org.testng.annotations.Test;

public class TestRun extends Base{
    @Test
    public void InitialLoginTests() {
        System.out.println("Executing InitialLoginTests");
        loginPage.clickIntLogin();
    }

    @Test
    public void enterUsernameTests() {
        System.out.println("Executing enterUsernameTests");
        loginPage.setEnterUsername_id(ReadFromExcel.username);
    }

    @Test(dependsOnMethods = {"enterUsernameTests"})
    public void enterPasswordTests() {
        System.out.println("Executing enterPasswordTests");
        loginPage.setEnterPassword_id(ReadFromExcel.password);
    }

    @Test(dependsOnMethods = {"enterUsernameTests", "enterPasswordTests"})
    public void loginButtonTests() {
        System.out.println("Executing loginButtonTests");
        loginPage.clickLoginBtn_id();
    }

    @Test(dependsOnMethods = {"loginButtonTests"})
    public void homePageTests() {
        homePage.setNameOfUserVerification_id();
        takeScreenShots.takesSnapShot(driver,"Home Page");
        
    }

}
