package ru.crystals.sco.setrobot.ncr;

import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import org.junit.Test;

public class Sample {
    @Test
    public void e2eTest() throws Exception {
        SelenideConfig selenideConfig = new SelenideConfig();
        selenideConfig.browser(DriverProvider.class.getName());
        SelenideDriver selenide = new SelenideDriver(selenideConfig);
        selenide.open();
    }
}
