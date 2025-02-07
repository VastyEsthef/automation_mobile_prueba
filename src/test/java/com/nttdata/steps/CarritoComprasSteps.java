package com.nttdata.steps;

import com.nttdata.screens.ListProductsScreen;

import com.nttdata.screens.SelectQuantityAndProduct;
import net.serenitybdd.annotations.Step;
import org.junit.Assert;

public class CarritoComprasSteps {

    ListProductsScreen listProductsScreen;
    SelectQuantityAndProduct selectQuantityAndProduct;

    @Step("Validar que estoy en la aplicación")
    public void validateImInTheApp() {
        Assert.assertTrue(listProductsScreen.isProductsDisplayed());
    }

    // Valido que existan los 4 productos por medio de sus nombres
    public void validateSauce_Labs_BackpackAppears() {
        Assert.assertEquals("Sauce Labs Backpack",listProductsScreen.ProductBackpackDisplayed());
    }

    public void validateSauce_Labs_Bike_LightAppears() {
        Assert.assertEquals("Sauce Labs Bike Light",listProductsScreen.ProductSauceLabsBikeLightDisplayed());
    }

    public void validateSauce_Labs_Bolt_T_ShirtAppears() {
        Assert.assertEquals("Sauce Labs Bolt T-Shirt",listProductsScreen.ProductSauceLabsBoltTShirtDisplayed());
    }

    public void validateSauce_Labs_Fleece_JacketAppears() {
        Assert.assertEquals("Sauce Labs Fleece Jacket",listProductsScreen.ProductSauceLabsFleeceJacketDisplayed());
    }

    public void clickProduct() {
        listProductsScreen.SelectProduct();
    }

    public void selectQuantityAndProduct(int quantiy, String productName) {
        //listProductsScreen.(productName);
        selectQuantityAndProduct.selectQuantityProduct(quantiy);
    }
}
