package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends AbstractPage {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    @FindBy(xpath = "//div[@class= 'normal-text res-error']/child::p")
    private ExtendedWebElement errorText;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String loginError() {
        LOGGER.info("Login result [" + errorText.getText() + "]");
        return errorText.getText();
    }

}