package com.example.test.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {

   public WebDriver wd;
    UserHelper user;
    MainPageHelper mainpage;

    public void init() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://propets-31.herokuapp.com");
        user = new UserHelper(wd);
        mainpage = new MainPageHelper(wd);
    }

    public UserHelper getUser() {
        return user;
    }

    public MainPageHelper getMainpage() {
        return mainpage;
    }

    public void stop() {
        wd.quit();
    }

}
