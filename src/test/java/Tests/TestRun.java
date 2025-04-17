package Tests;

import org.testng.annotations.Test;

public class TestRun extends Base{
    @Test
    public void InitialLoginTests(){
        loginPage.clickIntLogin();
    }
}
