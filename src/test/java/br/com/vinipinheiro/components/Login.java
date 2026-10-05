package br.com.vinipinheiro.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.vinipinheiro.pages.HomePage;

public class Login extends BaseComponent {
    private By emailLocator = By.name("email");
    private By passwordLocator = By.name("password");
    private By loginButtonLocator = By.tagName("button");

    public Login(WebElement root) {
        super(root);
    }

    public Login typeEmail(String email) {
        root.findElement(emailLocator).sendKeys(email);
        return this;
    }

    public Login typePassword(String password) {
        root.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public HomePage submitLogin(WebDriver driver) {
        root.findElement(loginButtonLocator).submit();
        return new HomePage(driver);
    }

    public Login submitLoginExpectingFailure() {
        root.findElement(loginButtonLocator).submit();
        return this;
    }
}