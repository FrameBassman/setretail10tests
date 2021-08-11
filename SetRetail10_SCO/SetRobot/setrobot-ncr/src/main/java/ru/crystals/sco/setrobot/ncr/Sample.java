package ru.crystals.sco.setrobot.ncr;

import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Sample {
    private SelenideDriver selenide;
    protected Logger logger = LoggerFactory.getLogger(Sample.class);

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

    @Test
    public void switchBetween() throws Exception {
        Set<String> handles = selenide.getWebDriver().getWindowHandles();
        for (Iterator<String> it = handles.iterator(); it.hasNext(); ) {
            logger.info("Switch to the next window");
            String handle = String.valueOf(it.next());
            selenide.getWebDriver().switchTo().window(handle);
            Thread.sleep(Duration.ofSeconds(2).toMillis());
        }
    }
}
