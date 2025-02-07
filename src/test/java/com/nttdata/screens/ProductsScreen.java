package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRODUCTS\"]")
    private WebElement productosLabel;


    public boolean isProductsDisplayed() {

        waitFor(ExpectedConditions.visibilityOf(productosLabel));
        return productosLabel.isEnabled();
    }
}
