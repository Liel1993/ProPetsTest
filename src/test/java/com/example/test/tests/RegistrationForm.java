package com.example.test.tests;

import com.example.test.models.User;
import com.example.test.tests.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationForm extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        if (!app.getUser().isElementSignInButtonPresent()) {
            app.getUser().logOut();
        }
    }

    @Test
        public void testRegistration() throws InterruptedException {
                Assert.assertTrue(app.getUser().isElementSignInButtonPresent());
                app.getMainpage().goToSignInButton();
                app.getUser().selectSignUp();
                app.getUser().fillRegistrationForm(new User().setName("Liel251234*")
                        .setEmail("lerka---+78967@mail.ru")
                        .setPassword("Ba12345%")
                        .setPasswordSignUpCheck("Ba12345%"));
                Thread.sleep(5000);
                app.getUser().clickSubmitButton("sign-up");
                Thread.sleep(50000);
                String messageReg = app.wd.findElement(By.xpath("//p[contains(.,'Registration completed successfully.')]")).getText();
                System.out.println(messageReg);
                Assert.assertEquals(messageReg,
                        "Registration completed successfully. We have sent you an email with a link to activate your account.");
            }
    @Test
    public void negativeTestRegistrationPasswordDontMatch() throws InterruptedException {
        Assert.assertTrue(app.getUser().isElementSignInButtonPresent());
        app.getMainpage().goToSignInButton();
        app.getUser().selectSignUp();
        app.getUser().fillRegistrationForm(new User().setName("Liel25123^")
                .setEmail("lerka---+78366@mail.ru")
                .setPassword("Ba12345%")
                .setPasswordSignUpCheck("Gwrew5%"));
        Thread.sleep(5000);
        app.getUser().clickSubmitButton("sign-up");
        Thread.sleep(5000);
        String messageReg = app.wd.findElement(By.cssSelector(".alert-warning.signtab_passwordWarning__3k_pk")).getText();
        System.out.println(messageReg);
        Assert.assertEquals(messageReg,
                "Passwords don't match");
    }



    /// КАК СЛОВИТЬ ЛОКАТОР НА ВСПЛЫВАЮЩЕЕ ОКНО "ЗАПОЛНИ ПОЛЕ" и ЗАПУСТИТЬ НЕГАТИВНЫЙ ТЕСТ
  /*  @Test
    public void negativeTestRegistrationWithoutPassword() throws InterruptedException {
        Assert.assertTrue(app.getUser().isElementSignInButtonPresent());
        app.getMainpage().goToSignInButton();
        app.getUser().selectSignUp();
        app.getUser().fillRegistrationForm(new User().setName("Liel25123^")
                .setEmail("lerka---+78366@mail.ru")
                .setPasswordSignUpCheck("Gwrew5%"));
        Thread.sleep(5000);
        app.getUser().clickSubmitButton("sign-up");
        Thread.sleep(5000);
        String messageReg = app.wd.findElement(By.cssSelector(".alert-warning.signtab_passwordWarning__3k_pk")).getText();
        System.out.println(messageReg);
        Assert.assertEquals(messageReg,
                "");
    }*/
/// ПРОВЕРИТЬ В ПОСТМЕН ПОЧЕМУ ДАЕТ РЕГИСТРИРОВАТЬСЯ С INVALID EMAIM WITHOUT DOMEN AND WITH DOMEN ONLY @MAIL.RU
    @Test
    public void negativeTestRegistrationInvalidEmail() throws InterruptedException {
        Assert.assertTrue(app.getUser().isElementSignInButtonPresent());
        app.getMainpage().goToSignInButton();
        app.getUser().selectSignUp();
        app.getUser().fillRegistrationForm(new User().setName("Liel25123^")
                .setEmail("lerka---+78366mail.ru")
                .setPassword("Ba12345%")
                .setPasswordSignUpCheck("Gwrew5%"));
        Thread.sleep(5000);
        app.getUser().clickSubmitButton("sign-up");
        Thread.sleep(5000);
        String messageReg =app.wd.findElement(By.cssSelector(".alert-warning.signtab_passwordWarning__3k_pk")).getText();
        System.out.println(messageReg);
        Assert.assertEquals(messageReg,
                "Passwords don't match");
    }


}




