package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AddAccountPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private AddAccountPage addAccount;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        addAccount = new AddAccountPage(driver);
        
        loginPage.navigateToLoginPage("https://seubarriga.wcaquino.me/");
    }

    @When("I enter the username {string} and password {string}")
    public void iEnterUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("I click the login button")
    public void iClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @And("I should be logged in")
    public void iShouldBeLoggedIn() {
        // Add assertions to check if the login was successful
        // For example: assertTrue(driver.getCurrentUrl().contains("dashboard"));
    	assertTrue(homePage.isDashboardDisplayed());
        //driver.quit();
    }

    @And("I click in contas")
    public void i_click_in_contas() {
        homePage.clickInContas();
    }

    @When("I click in adicionar")
    public void i_click_in_adicionar() {
    	homePage.clickInAdicionar();
    }
    @When("I type a name for the new account and click in save")
    public void i_type_a_name_for_the_new_account_and_click_in_save() {
        addAccount.setName();
        addAccount.clickInSave();
    }
    @Then("I make sure the account was created")
    public void i_make_sure_the_account_was_created() {
    	assertTrue(addAccount.isDashboardDisplayed());
    }






}