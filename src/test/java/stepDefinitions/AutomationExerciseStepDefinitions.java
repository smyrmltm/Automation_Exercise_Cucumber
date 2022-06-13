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

    @Given("Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password() {
        automationExercisePage.loginYourAccountEmailBox.sendKeys(ConfigReader.getProperty("autoExInvalidEmail"));
        automationExercisePage.loginYourAccountPasswordBox.sendKeys(ConfigReader.getProperty("autoExValidPassword"));
    }
    @Given("Verify error Your email or password is incorrect is visible")
    public void verify_error_your_email_or_password_is_incorrect_is_visible() {
        Assert.assertTrue(automationExercisePage.emailOrPasswordIncorrectText.isDisplayed());

    }
    @Given("Verify New User Signup is visible")
    public void verify_new_user_signup_is_visible() {
    Assert.assertTrue(automationExercisePage.newUserSignupTextElement.isDisplayed());
    }
    @Given("Enter name and email address")
    public void enter_name_and_email_address() {
    actions.click(automationExercisePage.userNameElement)
            .sendKeys(fakerName).sendKeys(Keys.TAB).sendKeys(fakerEmail).perform();

    }
    @Given("Click Signup button")
    public void click_signup_button() {
        automationExercisePage.signupButton.click();

    }
    @Given("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {
     Assert.assertTrue(automationExercisePage.enterAccountInfoTextElement.isDisplayed());

    }
    @Given("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        actions.click(automationExercisePage.acountInfoMrRadioButton)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("15634")
                .sendKeys(Keys.TAB).sendKeys("2")
                .sendKeys(Keys.TAB).sendKeys("March")
                .sendKeys(Keys.TAB).sendKeys("2019").perform();


    }
    @Given("Select checkbox Sign up for our newsletter")
    public void select_checkbox_sign_up_for_our_newsletter() {
        automationExercisePage.newsletterCheckbox.click();

    }
    @Given("Select checkbox Receive special offers from our partners")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        automationExercisePage.newsletterCheckbox2.click();

    }
    @Given("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        actions.sendKeys(Keys.TAB).sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB).sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys("United States")
                .sendKeys(Keys.TAB).sendKeys(faker.address().state())
                .sendKeys(Keys.TAB).sendKeys(faker.address().country())
                .sendKeys(Keys.TAB).sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).perform();
    }
    @Given("Click Create Account button")
    public void click_create_account_button() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

    }
    @Given("Verify that ACCOUNT CREATED is visible")
    public void verify_that_account_created_is_visible() {
        Assert.assertTrue(automationExercisePage.acountCreatedTextBox.isDisplayed());

    }
    @Given("Click Continue button")
    public void click_continue_button() {
        automationExercisePage.acountCreatedContinueButton.click();

    }
    @Given("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
        Assert.assertTrue(automationExercisePage.deleteAccountElement.isDisplayed());


    }



}
