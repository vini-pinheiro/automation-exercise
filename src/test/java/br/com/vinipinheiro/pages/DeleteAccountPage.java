package br.com.vinipinheiro.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteAccountPage extends BasePage {
    private By h2Locator = By.xpath("/html/body/section/div/div/div/h2");
    private By continueLocator = By.xpath("/html/body/section/div/div/div/div/a");

    public DeleteAccountPage(WebDriver driver) {
        super(driver);
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(d -> d.findElement(h2Locator));
    }

    public HomePage clickContinue(WebDriver driver) {
        driver.findElement(continueLocator).click();
        return new HomePage(driver);
    }
}
