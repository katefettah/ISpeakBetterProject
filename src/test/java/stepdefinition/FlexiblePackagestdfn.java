package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;

import pages.FlexiblePackagePages;

import utilities.Driver;
import utilities.JavaScriptUtil;

public class FlexiblePackagestdfn {

FlexiblePackagePages flexiblePackagePages=new FlexiblePackagePages();
WebDriver driver;

    @Given("User in the home page")
    public void user_in_the_home_page() {
    Driver.getDriver().get("https://ispeakbetter.com/");

    }

    @When("User scroll down the page")
    public void user_scroll_down_the_page() {

      JavaScriptUtil.scrollPageDown();
    }

    @When("Click Duration button")
    public void click_Duration_button() {
       flexiblePackagePages.selectDurationArrow.click();

       flexiblePackagePages.selectDuration.click();
    }

    @When("Click Subscribed Classes button")
    public void click_Subscribed_Classes_button() {
    flexiblePackagePages.subscribedClassArrow.click();

    flexiblePackagePages.subscribedClass.click();

    }

    @When("Click Classes\\/Week button")
    public void click_Classes_Week_button() {
    flexiblePackagePages.ClassArrow.click();

    flexiblePackagePages.Class.click();

    }

    @When("Click  Program button")
    public void click_Program_button() {
        flexiblePackagePages.ProgramArrow.click();

        flexiblePackagePages.typeProgram.click();

    }

    @Then("Click Buy button")
    public void click_Buy_button() {

        flexiblePackagePages.buyButton.click();

    }
}
