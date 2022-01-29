package techproed.tests.smoketest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigurationReader;
import techproed.utilities.Driver;
public class Day13_PositiveLogin {
   // testing important critical functionalities of the application
//   1.

    LoginPage loginPage;
    @Test
    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
        loginPage = new LoginPage();
        loginPage.loginDropdown.click();
        loginPage.signInButton.click();
        loginPage.username.sendKeys(ConfigurationReader.getProperty("employee_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("employee_password"));
        loginPage.loginButton.click();
    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}