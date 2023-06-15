package users;

public class Login {
    @io.cucumber.java.en.Given(": I open url saucedemo")
    public void iOpeningUrlSaucedemo() {
        System.out.println("hello");
    }

    @io.cucumber.java.en.When("I input username and password")
    public void iInputUsernameAndPassword() {
        System.out.println("hello");
    }

    @io.cucumber.java.en.And("I click login button")
    public void iClickLoginButton() {
        System.out.println("hello");
    }

    @io.cucumber.java.en.Then("I navigate to dashbord menu")
    public void iNavigateToDashbordMenu() {
        System.out.println("hello");
    }
}
