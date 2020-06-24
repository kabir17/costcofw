package homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {
    @FindBy(id = "header_sign_in")
    WebElement registerLink;
    @FindBy(linkText = "Create Account")
    WebElement createAccountBtn;
    @FindBy(xpath = "//input[@title='Email Address']")
    WebElement emailTextField;
    @FindBy(xpath = "//input[@title='Password']")
    WebElement passwordTextField;
    @FindBy(xpath = "//input[@title='Confirm Password']")
    WebElement confirmPasswordTextField;
    @FindBy(xpath = "//input[@value='Create Account']")
    WebElement submitCreatAccountBtn;

    public void signUp(String emailTextField,String passwordTextField,
                       String confirmPasswordTextField){
        this.registerLink.click();
        this.createAccountBtn.click();
        this.emailTextField.sendKeys(emailTextField);
        this.confirmPasswordTextField.sendKeys(confirmPasswordTextField);
        this.submitCreatAccountBtn.click();
    }
}