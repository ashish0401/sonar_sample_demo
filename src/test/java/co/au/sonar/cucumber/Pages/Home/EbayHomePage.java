package co.au.sonar.cucumber.Pages.Home;

import com.google.common.collect.Lists;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.*;


@DefaultUrl("page:home.page")
public class EbayHomePage extends PageObject {


	static final By SEARCH_TEXT_FIELD = By.id("gh-ac");
	static final By SEARCH_BTN = By.id("gh-btn");
	static final By BIKE_ITEM = By.cssSelector("#srp-river-results > ul > li:nth-child(2) > div > div.s-item__info.clearfix > a > div > span");
	static final By ADD_TO_CART_BTN = By.id("isCartBtn_btn");
	static final By ADD_PLAN_WINDOW = By.className("addon-overlay-body");
	static final By CART_ITEM_TITLE = By.cssSelector("span[class='BOLD']");

	public EbayHomePage(WebDriver driver){
		super(driver);

	}

	public void userSearchBikeKeyword() {
		element(SEARCH_TEXT_FIELD).waitUntilClickable().sendKeys("mountain bike");
		element(SEARCH_BTN).waitUntilClickable().click();
	}

	public void userAddFirstResultInCartAndVerify() {
		Assert.assertTrue(element(BIKE_ITEM).isDisplayed());
		String bikeTitle = element(BIKE_ITEM).getText();
		Actions action = new Actions(getDriver());

		action.keyDown(Keys.COMMAND)
				.click(element(BIKE_ITEM))
				.keyUp(Keys.COMMAND)
				.build()
				.perform();

		List<String> totalHandle = Lists.newArrayList(getDriver().getWindowHandles());
		getDriver().switchTo().window(totalHandle.get(1));
		waitABit(5000);
		waitForCondition().until(
						ExpectedConditions.visibilityOfElementLocated(ADD_TO_CART_BTN));
				element(ADD_TO_CART_BTN).click();

		try {
			element(ADD_PLAN_WINDOW).findElement(By.cssSelector("button.addon-overlay-close-button")).click();
		}catch (ElementNotVisibleException ee){
			System.out.println(Arrays.toString(ee.getStackTrace()));
		}

		// User verifies the cart has similar item as selected from search result
		Assert.assertEquals("Item added in cart has different title", bikeTitle, element(CART_ITEM_TITLE).getText());
	}




}
