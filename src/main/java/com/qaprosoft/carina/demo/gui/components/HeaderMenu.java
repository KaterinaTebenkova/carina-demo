package com.qaprosoft.carina.demo.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;


public class HeaderMenu extends AbstractUIObject {
    @FindBy(xpath = "//i[contains(@class, 'head-icon icon-signout')]")
    private ExtendedWebElement logOutButton;

    @FindBy(id = "login-active")
    private ExtendedWebElement loginIcon;

    public HeaderMenu(WebDriver driver, SearchContext searchContext){
        super(driver, searchContext);
    }

    public LoginMenu openLoginMenu(){
        loginIcon.click();
        return new LoginMenu(driver);
    }

    public boolean isLogOutButtonPresent(){
        return logOutButton.isPresent();
    }
}