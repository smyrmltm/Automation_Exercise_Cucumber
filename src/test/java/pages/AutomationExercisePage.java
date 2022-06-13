package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationExercisePage {
    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[text()=' Signup / Login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement newUserSignupTextElement;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement newUserSignupNameBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement newUserSignupEmailBox;

    @FindBy(xpath = "//button[text()='Signup']")
    public WebElement signupButton;

    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enterAccountInfoTextElement;

    @FindBy(xpath = "//input[@value='Mr']")
    public WebElement acountInfoMrRadioButton;

    @FindBy(id = "newsletter")
    public WebElement newsletterCheckbox;

    @FindBy(id = "optin")
    public WebElement newsletterCheckbox2;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement acountCreatedTextBox;

    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement acountCreatedContinueButton;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement userNameElement;

    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccountElement;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginYourAccountEmailBox;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginYourAccountPasswordBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement loginYourAccountTextBox;

    @FindBy(xpath = "//p[.='Your email or password is incorrect!']")
    public WebElement emailOrPasswordIncorrectText;

    @FindBy(xpath = "//a[.=' Logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//p[.='Email Address already exist!']")
    public WebElement emailAdressExistTextElement;

    @FindBy(xpath = "//a[.=' Contact us']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//*[.='Get In Touch']")
    public WebElement getInTouchTextElement;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement contactUsNameBox;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement contactUsSubmitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement contactUsAlertSuccessText;

    @FindBy(xpath = "//span[.=' Home']")
    public WebElement contactUsSuccessHomeButton;

    @FindBy(xpath = "//a[.=' Test Cases']")
    public WebElement testCasesButton;

    @FindBy(xpath = "//b[.='Test Cases']")
    public WebElement testCasesTitleText;

    @FindBy(xpath = "//a[text()=' Products']")
    public WebElement productsButton;

    @FindBy(xpath = "//h2[text()='All Products']")
    public WebElement allProductsTextElement;

    @FindBy(xpath = "//div[@class='productinfo text-center']")
    public List<WebElement> productsListElements;

    @FindBy(xpath = "(//li[.='View Product'])[1]")
    public WebElement firstViewProduct;

    @FindBy(xpath = "//div[@class='product-information']")
    public WebElement productDetails;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchProduct;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement searchProductSubmit;

    @FindBy(xpath = "//div[@class='productinfo text-center']")
    public WebElement searchedProduct;

    @FindBy(xpath = "//h2[.='Subscription']")
    public WebElement subscriptionTitle;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement subscriptionTextBox;

    @FindBy(xpath = "//div[@class='footer-widget']")
    public WebElement footerElement;

    @FindBy(xpath = "//a[text()=' Cart']")
    public WebElement cartButton;

    @FindBy(xpath = "//a[text()='Add to cart']")
    public List<WebElement> productsAddToCartElements;

    @FindBy(xpath = "//button[.='Continue Shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//u[.='View Cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> cartPrductListElements;

    @FindBy(xpath = "(//div[@class='single-products'])[1]")
    public WebElement firstProductElement;

    @FindBy(xpath = "(//a[text()='Add to cart'])[1]")
    public WebElement firstProductAddToCartButton;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement cartFirstElementName;

    @FindBy(xpath = "(//div[@class='single-products'])[2]")
    public WebElement secondProductElement;

    @FindBy(xpath = "(//a[text()='Add to cart'])[3]")
    public WebElement secondProductAddToCartButton;

    @FindBy(xpath = "//a[@href='/product_details/2']")
    public WebElement cartSecondElementName;

    @FindBy(xpath = "//td[@class='cart_price']")
    public List<WebElement> cartPriceElements;

    @FindBy(xpath = "//td[@class='cart_quantity']")
    public List<WebElement> cartQuantityElements;

    @FindBy(xpath = "//td[@class='cart_quantity']")
    public List<WebElement> cartTotalPriceElements;




}
