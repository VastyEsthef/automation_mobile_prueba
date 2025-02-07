package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoComprasSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;


public class CarritoComprasStepsDef {
    @Steps
    CarritoComprasSteps carritoComprasSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoy_en_la_aplicación_de_sauce_labs() {
        carritoComprasSteps.validateImInTheApp();
    }
    @And("valido que carguen correctamente los productos en la galeria")
    public void valido_que_carguen_correctamente_los_productos_en_la_galeria() {
        carritoComprasSteps.validateSauce_Labs_BackpackAppears();
        carritoComprasSteps.validateSauce_Labs_Bike_LightAppears();
        carritoComprasSteps.validateSauce_Labs_Bolt_T_ShirtAppears();
        carritoComprasSteps.validateSauce_Labs_Fleece_JacketAppears();

    }
    @When("agrego {int} del siguiente producto {string}")
    public void agrego_del_siguiente_producto(int cantidad, String productName) {

        carritoComprasSteps.selectQuantityAndProduct(cantidad, productName);
    }
    @Then("valido el carrito de compra actualice correctamente")
    public void valido_el_carrito_de_compra_actualice_correctamente() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
