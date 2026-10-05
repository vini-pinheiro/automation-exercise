package br.com.vinipinheiro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.vinipinheiro.components.Login;

public class LoginPage extends BasePage {
    private Login login;

    public LoginPage(WebDriver driver) {
        super(driver);
        if (!driver.getTitle().equals("Automation Exercise - Signup / Login")) {
            throw new IllegalStateException(
                    "Essa não é a página de Login, " + "a página atual é: " + driver.getCurrentUrl());
        }
        ;
        this.login = new Login(driver.findElement(By.className("login-form")));
    }

    public HomePage loginAs(String email, String password) {

        login.typeEmail(email);
        login.typePassword(password);
        return login.submitLogin(driver);
    }

}
