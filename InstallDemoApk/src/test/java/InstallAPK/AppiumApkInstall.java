package InstallAPK;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

public class
AppiumApkInstall {

    public UiAutomator2Options options;
    AndroidDriver driver;

    @BeforeTest
    public void environmentSetup() throws IOException, InterruptedException {

        //create Capabilities
        options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("Emulator");
        options.setApp(System.getProperty("user.dir") + "/src/test/resources/E-Commerce.apk");


        URL url = new URL("http://127.0.0.1:4723");

        //create object for AndroidDriver/IOSDriver
        driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(5000);

    }

    @Test(description = "install apk file")
    public void installAPK() throws InterruptedException {
        //String app_packageName = "com.studiobluelime.ecommerceapp";
        String appLogo_className = "android.widget.ImageView";
        String appName_className = "android.widget.TextView";
        String skipButton_id = "com.studiobluelime.ecommerceapp:id/btn_skip";
        String nextButton_id = "com.studiobluelime.ecommerceapp:id/btn_next";
        //String gotItButton_id = "com.studiobluelime.ecommerceapp:id/btn_next";

        String appName = driver.findElement(By.className(appName_className)).getText();
        System.out.println("App Name: "+appName);
        Thread.sleep(3000);

        boolean logo = driver.findElement(By.className(appLogo_className)).isDisplayed();
        if(logo){
          System.out.println("Logo is displayed");
        }else {
          System.out.println("Logo is not displayed");
        }
        Thread.sleep(3000);

        driver.findElement(By.id(nextButton_id)).click();
        Thread.sleep(3000);
        driver.findElement(By.id(skipButton_id)).click();
        Thread.sleep(3000);
    }

}
