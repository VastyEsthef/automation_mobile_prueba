package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;


public class ListProductsScreen extends PageObject {


    //@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    private WebElement productsLabel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Backpack\"]")
    private WebElement Backpack;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Bike Light\"]")
    private WebElement SauceLabsBikeLight;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement SauceLabsBoltTShirt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Fleece Jacket\"]")
    private WebElement SauceLabsFleeceJacket;

    @AndroidFindBy(id = "Sauce Labs Backpack")
    private WebElement selectProduct;



    public ListProductsScreen() {
        super();
    }

    public boolean isProductsDisplayed() {
        System.out.println("**************************");
        System.out.println(productsLabel.isEnabled());
        return productsLabel.isDisplayed();
        /*
        try {
            waitFor(ExpectedConditions.visibilityOf(productsLabel));
            System.out.println("Elemento encontrado: " + productsLabel.isDisplayed());
            return productsLabel.isDisplayed();
        } catch (Exception e) {
            System.out.println("Error al encontrar el elemento: " + e.getMessage());
            return false;
        }
        */

    }
    public String ProductBackpackDisplayed() {
        return Backpack.getText();
    }

    public String ProductSauceLabsBikeLightDisplayed() {
        return SauceLabsBikeLight.getText();
    }

    public String ProductSauceLabsBoltTShirtDisplayed() {
        return SauceLabsBoltTShirt.getText();
    }

    public String ProductSauceLabsFleeceJacketDisplayed() {
        return SauceLabsFleeceJacket.getText();
    }

    public void SelectProduct() {
        selectProduct.click();
    }



}
