package com.example.test.fw;

import com.example.test.fw.HelperBase;
import com.example.test.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserHelper extends HelperBase {

    public UserHelper(WebDriver wd) {
        super();
    }

    public void clickSubmitButton(String itemType) {
        new WebDriverWait(wd, 3000).until(ExpectedConditions.elementToBeClickable(By.cssSelector("[for='submit-form-"+ itemType +"']"))).click();
    }

    public void selectSignUp() {
        click(By.xpath("//*[@class='undefined undefined'][contains(.,'Sign up')]"));
    }

    public void fillRegistrationForm(User user) {
        type(By.cssSelector("#name"), user.getName());
        type(By.cssSelector("#email"), user.getEmail());
        type(By.cssSelector("#passwordSignUp"), user.getPassword());
        type(By.cssSelector("#passwordSignUpCheck"), user.getPasswordSignUpCheck());
    }

    public void logOut() {
        click(By.xpath("//p[contains(.,'Logout')]"));
    }

    public boolean isElementSignInButtonPresent() {
        return isElementPresent(By.cssSelector(".welcomepage_headerButton__1LyvV"));
    }

    public void selectSignIn() {
        click(By.xpath("//*[@class='undefined undefined'][contains(.,'Sign in')]"));
    }

    public void fillLoginForm(User user) {
        type(By.name("#emailSignIn"), user.getEmail());
        type(By.name("#passwordSignIn"), user.getPassword());

    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.xpath("//p[contains(.,'Add new')]"));
    }

    public boolean isLoginFormPresent() {

        return isElementPresent(By.cssSelector("#emailSignIn"));
    }

    public void signInSignUpForm() {
        findElement(By.cssSelector(".row.justify-content-center.welcomepage_modalWelcome__2Cl_t"));
    }

}
