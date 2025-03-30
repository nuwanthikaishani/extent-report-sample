package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver ;

    @FindBy(css = "[name='username']")
    WebElement usernameInput;

    @FindBy(css = "[name= 'password']")
    WebElement passwordInput;

    @FindBy(css ="[type='submit']")
    WebElement loginBtn;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void eneterUserName(String username){
       usernameInput.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void clickSubmitBtn(){
        loginBtn.click();
    }
}
