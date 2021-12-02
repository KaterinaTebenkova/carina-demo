package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.utils.UserService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends AbstractPage {

    @FindBy(id = "login-popup2")
    private ExtendedWebElement loginMenu;

    @FindBy(id = "email")
    private ExtendedWebElement enterEmail;

    @FindBy(id = "upass")
    private ExtendedWebElement enterPass;

    @FindBy(id = "nick-submit")
    private ExtendedWebElement submitButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "error_block")
    private WebElement errorText;

    public boolean isError() {
        if(errorText.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public LoginPage clickLoginButton() {
        submitButton.click();
        return new LoginPage(driver);

        public void enterName(UserService user) {
            enterEmail.type(user.getUser().getEmail());
            return submitButton();
        }

        public void enterPass(UserService user) {
            enterPass.type(user.getUser().getPassword());
            return submitButton();
        }


}
    public void verifyLoginUserNameError(String expectedText) {
        Assert.assertEquals(expectedText, errorMessageLogin.getText());
    }
