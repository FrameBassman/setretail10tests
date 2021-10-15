package ru.crystals.sco.setrobot.local;

import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;

public class SelenideCreator {
    public static SelenideDriver create() {
        SelenideConfig configuration = new SelenideConfig();
        configuration.browserSize("200x100");
        configuration.browser(MarathonDriverProvider.class.getName());
        SelenideDriver driver = new SelenideDriver(configuration);
        driver.open();
        return driver;
    }
}
