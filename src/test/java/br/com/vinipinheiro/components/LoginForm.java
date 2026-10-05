package br.com.vinipinheiro.components;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.vinipinheiro.pages.AccountCreatedPage;

public class LoginForm extends BaseComponent {
    private By titleLocator = By.id("id_gender1"); // Seleciona Mr.
    private By nameLocator = By.name("name");
    private By emailLocator = By.name("email");
    private By passwordLocator = By.id("password");
    private By dayOfBirthLocator = By.name("days");
    private By monthOfBirthLocator = By.name("months");
    private By yearOfBirthLocator = By.name("year");
    private By newsletterLocator = By.name("newsletter");
    private By receiveOffersLocator = By.name("optin");
    private By firstNameLocator = By.name("first_name");
    private By lastNameLocator = By.name("last_name");
    private By companyLocator = By.name("company");
    private By address1Locator = By.name("address1");
    private By address2Locator = By.name("address2");
    private By countryLocator = By.name("country");
    private By stateLocator = By.name("state");
    private By cityLocator = By.name("city");
    private By zipcodeLocator = By.name("zipcode");
    private By mobileNumberLocator = By.name("mobile_number");
    private By submitCreateAccountLocator = By.xpath("/html/body/section/div/div/div/div/form/button");

    public LoginForm(WebElement root) {
        super(root);
        new WebDriverWait((WebDriver) root, Duration.ofSeconds(3)).until(d -> d.findElement(By.tagName("h2")));
    }

    public LoginForm typeTitle(String title) {
        root.findElement(titleLocator).sendKeys(title);
        return this;
    }

    public LoginForm typeName(String name) {
        WebElement element = root.findElement(nameLocator);
        element.clear(); // Previne concatenação acidental se o campo já tiver texto
        element.sendKeys(name);
        return this;
    }

    public LoginForm typeEmail(String email) {
        root.findElement(emailLocator).sendKeys(email);
        return this;
    }

    public LoginForm typePassword(String password) {
        root.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public LoginForm typeDayOfBirth(String day) {
        root.findElement(dayOfBirthLocator).sendKeys(day);
        return this;
    }

    public LoginForm typeMonthOfBirth(String month) {
        root.findElement(monthOfBirthLocator).sendKeys(month);
        return this;
    }

    public LoginForm typeYearOfBirth(String year) {
        root.findElement(yearOfBirthLocator).sendKeys(year);
        return this;
    }

    public LoginForm typeNewsletter(String newsletter) {
        root.findElement(newsletterLocator).sendKeys(newsletter);
        return this;
    }

    public LoginForm typeReceiveOffers(String offers) {
        root.findElement(receiveOffersLocator).sendKeys(offers);
        return this;
    }

    public LoginForm typeFirstName(String firstName) {
        root.findElement(firstNameLocator).sendKeys(firstName);
        return this;
    }

    public LoginForm typeLastName(String lastName) {
        root.findElement(lastNameLocator).sendKeys(lastName);
        return this;
    }

    public LoginForm typeCompany(String company) {
        root.findElement(companyLocator).sendKeys(company);
        return this;
    }

    public LoginForm typeAddress1(String address1) {
        root.findElement(address1Locator).sendKeys(address1);
        return this;
    }

    public LoginForm typeAddress2(String address2) {
        root.findElement(address2Locator).sendKeys(address2);
        return this;
    }

    public LoginForm typeCountry(String country) {
        root.findElement(countryLocator).sendKeys(country);
        return this;
    }

    public LoginForm typeState(String state) {
        root.findElement(stateLocator).sendKeys(state);
        return this;
    }

    public LoginForm typeCity(String city) {
        root.findElement(cityLocator).sendKeys(city);
        return this;
    }

    public LoginForm typeZipcode(String zipcode) {
        root.findElement(zipcodeLocator).sendKeys(zipcode);
        return this;
    }

    public LoginForm typeMobileNumber(String mobileNumber) {
        root.findElement(mobileNumberLocator).sendKeys(mobileNumber);
        return this;
    }

    public LoginForm selectTitleMr() {
        root.findElement(titleLocator).click();
        return this;
    }

    public LoginForm checkNewsletter() {
        root.findElement(newsletterLocator).click();
        return this;
    }

    public LoginForm selectDayOfBirth(String day) {
        new Select(root.findElement(dayOfBirthLocator)).selectByVisibleText(day);
        return this;
    }

    public AccountCreatedPage submitCreateAccount(WebDriver driver) {
        root.findElement(submitCreateAccountLocator).submit();
        return new AccountCreatedPage(driver);
    }
}
