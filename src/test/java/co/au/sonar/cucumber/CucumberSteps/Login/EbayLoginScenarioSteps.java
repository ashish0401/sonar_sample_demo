package co.au.sonar.cucumber.CucumberSteps.Login;

import co.au.sonar.cucumber.StepDefinitions.Login.EbayLoginStepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EbayLoginScenarioSteps {


    @Steps
    EbayLoginStepDefinition login;



    @When("User click on sign in link")
    public void userClickSignIn(){
        login.user_try_to_sign_in();
    }

    @And("user try to login with empty email credential")
    public void userEnterEmptyEmail(){
        login.user_provide_empty_email();
    }

    @Then("User should see error message stating it")
    public void userSeeLoginError(){
        login.user_see_login_error();
    }


}
