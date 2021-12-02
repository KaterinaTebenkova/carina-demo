package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.demo.gui.pages.LoginPage;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.components.LoginMenu;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.utils.UserService;



public class WebTest implements IAbstractTest {
    @Test
    @MethodOwner(owner = "qpsdemo")
    public void verifyLogin(){
        // Open GSM Arena home page and verify page is opened
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        UserService userService = new UserService();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        LoginMenu loginMenu = homePage.getHeader().openLoginMenu();
        Assert.assertTrue(loginMenu.isLoginMenuPresent(),"Login form isn't present");
        loginMenu.login(userService);
        Assert.assertTrue(homePage.getHeader().isLogOutButtonPresent(),"Button isn't present");
    }

    @Test
    public void wrongLogin(){
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.enterEmail(login);
        loginPage.enterPass(password);
        loginPage.clickLoginButton();


        loginPage.verifyLoginUserNameError("User isn't logged");



    }
}
