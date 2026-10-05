package br.com.vinipinheiro.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreatedPage extends BasePage {
    private By continueLocator = By.xpath("/html/body/section/div/div/div/div/a");

    public AccountCreatedPage(WebDriver driver) {
        super(driver);
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(d -> d.findElement(By.tagName("h2")));
    }

    public HomePage clickContinue(WebDriver driver) {
        driver.findElement(continueLocator).click();
        return new HomePage(driver);
    }
}
