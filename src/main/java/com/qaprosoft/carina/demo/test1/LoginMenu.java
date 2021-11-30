package com.qaprosoft.carina.demo.test1;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginMenu extends AbstractUIObject {
    @FindBy(id = "login-popup2")
    private ExtendedWebElement loginMenu;

    @FindBy(id = "email")
    private ExtendedWebElement enterEmail;

    @FindBy(id = "upass")
    private ExtendedWebElement enterPass;

    @FindBy(id = "nick-submit")
    private ExtendedWebElement submitButton;

    LoginMenu(WebDriver driver){
        super(driver);
    }
    public boolean isLoginMenuPresent(){
        return loginMenu.isElementPresent();
    }

    public HomePage login(UserService user){
        enterEmail.type(user.getUser().getEmail());
        enterPass.type(user.getUser().getPassword());
        return submitButton();
    }

    private HomePage submitButton(){
        submitButton.click();
        return  new HomePage(getDriver());
    }
}
