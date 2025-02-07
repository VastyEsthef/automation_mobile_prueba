package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SelectQuantityAndProduct extends PageObject {

    @AndroidFindBy()
    private WebElement quantity;

    @AndroidFindBy()
    private WebElement nameProduct;


    public void selectQuantityProduct(int quantity) {
        quantity.click();
    }
}
