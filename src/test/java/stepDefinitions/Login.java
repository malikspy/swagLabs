package stepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Login {
    public WebDriver driver;

    public Login() {
        driver = Hooks.driver;
    }

    @Given("I open url saucedemo")
    public void iOpeningUrlSaucedemo() {
        System.out.println("hello");
    }

    @When("I input username and password")
    public void iInputUsernameAndPassword() {
        System.out.println("hello");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        System.out.println("hello");
    }

    @Then("I navigate to dashbord menu")
    public void iNavigateToDashbordMenu() {
        System.out.println("hello");
    }
}
