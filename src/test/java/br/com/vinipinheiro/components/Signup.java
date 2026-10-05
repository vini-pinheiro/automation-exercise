package br.com.vinipinheiro.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.vinipinheiro.pages.HomePage;

public class Signup extends BaseComponent {
    private By nameLocator = By.name("name");
    private By emailLocator = By.name("email");
    private By loginButtonLocator = By.tagName("button");

    public Signup(WebElement root) {
        super(root);
    }

    public Signup typeName(String name) {
        root.findElement(nameLocator).sendKeys(name);
        return this;
    }

    public Signup typeEmail(String email) {
        root.findElement(emailLocator).sendKeys(email);
        return this;
    }

    public HomePage submitLogin(WebDriver driver) {
        root.findElement(loginButtonLocator).submit();
        return new HomePage(driver);
    }

    public Signup submitLoginExpectingFailure() {
        root.findElement(loginButtonLocator).submit();
        return this;
    }
}
