package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Utilities.BaseClass;

public class userObject extends BaseClass {
    public userObject(WebDriver webDriver){
        super(webDriver);
        PageFactory.initElements(webDriver,this);
    }
    @FindBy(id="username")
    private WebElement InputUsername;

    @FindBy(id="password")
    private WebElement InputPassword;

    @FindBy(id="login-button")
    private WebElement LoginBtn;

    public boolean IsloginAppear(){
        InputUsername.isDisplayed();
        InputPassword.isDisplayed();
        LoginBtn.isDisplayed();
        return true;
    }

    public void setUsername(String username){
        InputUsername.sendKeys(username);
    }
    public void setPassword(String password){
        InputPassword.sendKeys(password);
    }
    public void ClickLogin(){
        LoginBtn.click();
    }
}
