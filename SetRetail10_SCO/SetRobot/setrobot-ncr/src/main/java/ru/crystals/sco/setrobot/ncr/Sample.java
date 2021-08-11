package ru.crystals.sco.setrobot.ncr;

import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class Sample {
    private SelenideDriver selenide;

    @Before
    public void setup() throws Exception {
        SelenideConfig selenideConfig = new SelenideConfig();
        selenideConfig.browser(DriverProvider.class.getName());
        selenideConfig.browserSize(null);
        selenide = new SelenideDriver(selenideConfig);
        selenide.open();
    }

    @Test
    public void e2eTest() throws Exception {
        SelenideElement main = selenide.find(By.name("SCOTInputWindow"));
        main.find(By.name("Shut Down SCOTAPP application")).click();
    }
}
