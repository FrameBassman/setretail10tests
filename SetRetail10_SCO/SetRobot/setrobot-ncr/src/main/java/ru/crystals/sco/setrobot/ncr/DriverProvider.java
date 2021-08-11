package ru.crystals.sco.setrobot.ncr;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverProvider implements WebDriverProvider {
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull DesiredCapabilities cap) {
        cap.setCapability("launchDelay","5"); //задержка после запуска программы
        cap.setCapability("debugConnectToRunningApp", true);
        try {
            return new RemoteWebDriver(new URL("http://172.29.17.8:9999"), cap);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Error in URL");
        }
    }
}
