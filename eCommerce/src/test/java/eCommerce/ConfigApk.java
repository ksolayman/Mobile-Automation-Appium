package eCommerce;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ConfigApk {

    static AppiumDriverLocalService server;
    public static UiAutomator2Options options;
    static AndroidDriver driver;

    @BeforeClass
    public static void configAppium() throws InterruptedException, MalformedURLException {

        //create Capabilities
        options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("Emulator");
        options.setApp(System.getProperty("user.dir") + "/src/test/resources/E-Commerce.apk");
        URL url = new URL("http://127.0.0.1:4723");

        //create object for AndroidDriver/IOSDriver
        driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
        Thread.sleep(5000);

        //Click next/skip Button
        String skipButton_id = "com.studiobluelime.ecommerceapp:id/btn_skip";
        String nextButton_id = "com.studiobluelime.ecommerceapp:id/btn_next";
        Thread.sleep(3000);

        driver.findElement(By.id(nextButton_id)).click();
        Thread.sleep(3000);
        driver.findElement(By.id(skipButton_id)).click();
        Thread.sleep(8000);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}