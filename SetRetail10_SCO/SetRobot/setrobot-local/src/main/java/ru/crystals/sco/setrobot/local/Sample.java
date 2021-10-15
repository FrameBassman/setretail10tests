package ru.crystals.sco.setrobot.local;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sample {
    protected Logger logger = LoggerFactory.getLogger(Sample.class);

    @Test
    public void itWorks() {
        SelenideDriver selenide = SelenideCreator.create();

        logger.info("start ViaSelenide.clickOnButton_labelShouldBeDisplayed");
        selenide.find(By.name("TestButton")).click();
        selenide.find(By.name("LogLabel")).shouldBe(Condition.visible);
    }
}
