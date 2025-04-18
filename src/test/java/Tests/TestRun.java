package Tests;

import Utils.ReadFromExcel;
import org.testng.annotations.Test;

public class TestRun extends Base{
    @Test
    public void InitialLoginTests(){
        loginPage.clickIntLogin();
    }
    @Test
    public void enterUsernameTests(){
        loginPage.setEnterUsername_id(ReadFromExcel.username);
    }
    @Test
    public void enterPasswordTests(){
        loginPage.setEnterPassword_id(ReadFromExcel.password);
    }
    @Test(dependsOnMethods = {"enterUsernameTests","enterPasswordTests"})
    public void loginButtonTests(){
        loginPage.clickLoginBtn_id();
    }

}
