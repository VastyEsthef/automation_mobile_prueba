package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.ProductsScreen;
import org.junit.Assert;

public class LoginSteps {

    LoginScreen loginScreen;
    ProductsScreen productsScreen;

    public void validateLoginDisplayed() {
        Assert.assertTrue(loginScreen.titleVisible());
    }

    public void login(String username, String password) {
        loginScreen.enterUsername(username);
        loginScreen.enterPassword(password);
        loginScreen.clickLoginButton();
    }

    public void loginSuccess() {
        Assert.assertTrue(productsScreen.isProductsDisplayed());
    }

}
