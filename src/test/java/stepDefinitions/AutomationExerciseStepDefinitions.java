package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationExerciseStepDefinitions {
    AutomationExercisePage automationExercisePage = new AutomationExercisePage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    String fakerName = faker.name().fullName();
    String fakerEmail = faker.internet().emailAddress();

    @Given("Launch browser and Navigate to url {string}")
    public void launch_browser_and_navigate_to_url(String automationExerciseUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("automationExerciseUrl"));
    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String expectedUrl = ConfigReader.getProperty("automationExerciseUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Given("Click on Signup Login button")
    public void click_on_signup_login_button() {
        automationExercisePage.signupLoginButton.click();
    }

    @Given("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        Assert.assertTrue(automationExercisePage.loginYourAccountTextBox.isDisplayed());
    }

    @Given("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        automationExercisePage.loginYourAccountEmailBox.sendKeys(ConfigReader.getProperty("autoExValidEmail"));
        automationExercisePage.loginYourAccountPasswordBox.sendKeys(ConfigReader.getProperty("autoExValidPassword"));
    }

    @Given("Click login button")
    public void click_login_button() {
        automationExercisePage.loginButton.click();
    }

    @Given("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(automationExercisePage.userNameElement.isDisplayed());
    }

    @Given("Click Delete Account button")
    public void click_delete_account_button() {
        automationExercisePage.deleteAccountElement.click();
    }

    @Given("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
        //calişmiyor



    }

}
