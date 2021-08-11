package ru.crystals.sco.setrobot.ncr;

import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import org.junit.Test;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class Sample {
    @Test
    public void e2eTest() throws Exception {
//        Thread.sleep(Duration.ofSeconds(15).toMillis());
        SelenideConfig selenideConfig = new SelenideConfig();
        selenideConfig.browser(DriverProvider.class.getName());
        SelenideDriver selenide = new SelenideDriver(selenideConfig);
        selenide.open();
    }

    @Test
    public void itWorks() throws Exception {
        assertThat(1, equalTo(1));
    }
}
