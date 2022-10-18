package co.au.sonar.cucumber.StepDefinitions.Home;

import co.au.sonar.cucumber.Pages.Home.EbayHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EbayHomeStepDefinition extends ScenarioSteps {

	EbayHomePage homePage;

	@Step
	public void opens_ebay_home_page() {
		homePage.open();
		getDriver().manage().window().maximize();
	}

	@Step
	public void user_search_bike_on_ebay(){
		homePage.userSearchBikeKeyword();
	}

	@Step
	public void user_check_in_cart_for_item_and_verify_it(){
		homePage.userAddFirstResultInCartAndVerify();
	}



}
