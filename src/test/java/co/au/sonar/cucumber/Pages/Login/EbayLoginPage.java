package co.au.sonar.cucumber.Pages.Login;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;


@DefaultUrl("page:home.page")
public class EbayLoginPage extends PageObject {


    static final By SIGN_IN_LINK = By.cssSelector("span[id='gh-ug'] > a");
    static final By LOGIN_CONTINUE_BTN = By.id("signin-continue-btn");
    static final By LOGIN_ERROR_MSG = By.id("errormsg");



    public EbayLoginPage(WebDriver driver){
        super(driver);
    }

    public void userClickSignInLink(){
        element(SIGN_IN_LINK).click();
    }

    public void userGiveEmptyCreds(){
        waitForCondition().until(
                ExpectedConditions.visibilityOfElementLocated(LOGIN_CONTINUE_BTN));
        element(LOGIN_CONTINUE_BTN).click();
    }

    public void userSeeLoginError(){
        Assert.assertEquals("Unexpected error message", "Oops, that's not a match.", element(LOGIN_ERROR_MSG).getText());
    }
}
