package com.example.test.fw;

import com.example.test.fw.HelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageHelper extends HelperBase {

    public MainPageHelper(WebDriver wd) {
        super();
    }

    ///Нужно ли создавать отдельный класс помошник для HomePage -> Button SignIn
        public void goToSignInButton() {
            click(By.cssSelector(".welcomepage_headerButton__1LyvV"));
        }
}
