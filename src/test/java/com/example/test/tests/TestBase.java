package com.example.test.tests;

import com.example.test.fw.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp(){
        app.init();
    }

    @AfterMethod(enabled = false)
    public void teerDown(){
        app.stop();

    }

}
