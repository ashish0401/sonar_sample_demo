package co.au.sonar.cucumber.StepDefinitions.Login;

import co.au.sonar.cucumber.Pages.Login.EbayLoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EbayLoginStepDefinition extends ScenarioSteps {


    EbayLoginPage loginPage;

    @Step
    public void user_try_to_sign_in(){
        loginPage.userClickSignInLink();
    }

    @Step
    public void user_provide_empty_email(){
        loginPage.userGiveEmptyCreds();
    }

    @Step
    public void user_see_login_error(){
        loginPage.userSeeLoginError();
    }
}
