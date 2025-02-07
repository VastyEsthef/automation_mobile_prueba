package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginStepsDef {
    @Steps
    LoginSteps loginSteps;

    @Given("estoy en la aplicacion Swag Labs")
    public void estoy_en_la_aplicacion_swag_labs() {

        loginSteps.validateLoginDisplayed();
    }
    @When("ingreso mis credenciales como usuario {string} y clave {string}")
    public void ingreso_mis_credenciales_como_usuario_y_clave(String username, String password) {

        loginSteps.login(username, password);
    }
    @Then("ingreso a la app")
    public void ingreso_a_la_app() {
        loginSteps.loginSuccess();
    }
}
