package com.example.test.tests;

import com.example.test.models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {
   /* @BeforeClass
    public void ensurePreconditions() {
        if(!app.getUser().isLoginFormPresent()){
            if(app.getUser().isUserLoggedIn()){
                app.getUser().logOut();
                app.getMainpage().goToSignInButton();
            }

            // click(By.xpath("//*[@class='undefined undefined'][contains(.,'Sign in')]"));     //click on button logIn
        } app.getMainpage().goToSignInButton();
    }*/

    @Test
    public void loginRegistratedPositiveTest() throws InterruptedException {
        Thread.sleep(3000);
        app.getMainpage().goToSignInButton();
        app.getUser().signInSignUpForm();
        app.getUser().selectSignIn();
        Thread.sleep(3000);
          app.getUser().fillLoginForm(
                  new User().setEmail("lerka---+789366@mail.ru").setPassword("Ba12345%"));
       // Thread.sleep(3000);
          app.getUser().clickSubmitButton("sign-in");
        Thread.sleep(3000);
          Assert.assertTrue(app.getUser().isUserLoggedIn());
          //Узнать как можно на данном этапе создать метод
          String name = app.wd.findElement(By.cssSelector(".sidebar_userName__p87KP")).getText();
          System.out.println(name);
        Assert.assertEquals(name, "Liel25123$");


        }



}
   //a[@class='sidebar_activeLink__3Q9ci']//div[@class='media-body']/p[@class='sidebar_userName__p87KP']