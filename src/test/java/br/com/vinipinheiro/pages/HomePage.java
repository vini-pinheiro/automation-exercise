package br.com.vinipinheiro.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    private By loggedMessageLocator = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a");
    private By deleteAccountLocator = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a");

    public HomePage(WebDriver driver) {
        super(driver);
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(d -> d.findElement(loggedMessageLocator));
    }

    public DeleteAccountPage clickDeleteAccount() {
        driver.findElement(deleteAccountLocator).click();
        return new DeleteAccountPage(driver);
    }
}
