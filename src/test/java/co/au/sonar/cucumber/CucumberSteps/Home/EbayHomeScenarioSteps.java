package co.au.sonar.cucumber.CucumberSteps.Home;

import co.au.sonar.cucumber.StepDefinitions.Home.EbayHomeStepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EbayHomeScenarioSteps {

	@Steps
	EbayHomeStepDefinition home;

	@Given("User can open Ebay Home Page")
	public void userOpensHomePage() {
		home.opens_ebay_home_page();
	}

	@When("User search for the bike keyword")
	public void userSearchForBikeKeyword() {
		home.user_search_bike_on_ebay();
	}

	@Then("User select the first search result and add to cart and verify it")
	public void userVerifiesBikeAdditionInCart(){
		home.user_check_in_cart_for_item_and_verify_it();
	}


}
