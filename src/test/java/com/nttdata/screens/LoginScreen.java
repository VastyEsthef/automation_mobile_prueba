package com.nttdata.screens;


import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.widget.ImageView[1]")
    private WebElement title;

    @AndroidFindBy(accessibility = "test-Username")
    private WebElement username;

    @AndroidFindBy(accessibility = "test-Password")
    private WebElement password;

    @AndroidFindBy(accessibility = "test-LOGIN")
    private WebElement loginbutton;


    public boolean titleVisible() {
        return title.isDisplayed();
    }

    public void enterUsername(String user) {
        username.sendKeys(user);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickLoginButton() {
        loginbutton.click();
    }
}
