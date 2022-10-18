package co.au.sonar.cucumber;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/login/",
        plugin = {"json:target/cucumber_json/cucumber.json"})
public class EbayLoginTests {
}
