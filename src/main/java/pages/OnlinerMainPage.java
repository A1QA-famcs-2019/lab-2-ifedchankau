package pages;

import driver.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OnlinerMainPage {
    private WebElement loginBtn = Browser.getDriver().findElement(By.xpath("//div[contains(@class,'auth-bar__item--text')]"));

    public void clickLogIn() {
        loginBtn.click();
    }
}
