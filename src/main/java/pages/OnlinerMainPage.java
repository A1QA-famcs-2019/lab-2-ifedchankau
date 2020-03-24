package pages;

import driver.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OnlinerMainPage {
    private String loginButtonXPath = "//div[contains(@class,'auth-bar__item--text')]";
    private String userMenuButtonXPath = "//a[contains(@class, 'js-toggle-bar') and contains(@class, 'b-top-profile__preview')]";
    private String logoutButtonXPath = "//div[@class='b-top-profile__header']//div[@class='b-top-profile__logout']//a[contains(@class, 'b-top-profile__link')]";


    public void clickLogIn() {
        click(loginButtonXPath);
    }


    public void clickLogOut() {
        click(userMenuButtonXPath);
        click(logoutButtonXPath);
    }


    private void click(String XPath) {
        Browser.getDriver().findElement(By.xpath(XPath)).click();
    }
}
