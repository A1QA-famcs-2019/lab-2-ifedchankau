import driver.Browser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginForm;
import pages.OnlinerMainPage;

import java.util.concurrent.TimeUnit;

public class OnlinerTest {

    @BeforeMethod
    public void setUp() {
        Browser.getDriver().manage().window().maximize();
        Browser.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Browser.getDriver().get("http://onliner.by/");
    }

    @Test
    public void onlinerTest() {

        OnlinerMainPage onlinerMainPage = new OnlinerMainPage();
        onlinerMainPage.clickLogIn();

        LoginForm loginForm = new LoginForm();
        loginForm.login();
    }
}
