import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    @Test(description = "Validate user can set his location")
    public void ValidateTemperaturePage()
    {
        loginPage=new LoginPage(driver);
    }

}
