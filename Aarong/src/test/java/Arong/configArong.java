package Arong;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class configArong {

    AndroidDriver driver;
    UiAutomator2Options options;

    @BeforeClass
    public void configArongApp() throws MalformedURLException, InterruptedException {

        options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("Android Emulator");
        options.setApp(System.getProperty("user.dir")+"/src/resource/Aarong_23.0.0.apk");

        URL url = new URL("http://127.0.0.1:4723");

        driver = new AndroidDriver(url,options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(240));
        Thread.sleep(3000);

        //move to next pages
        driver.findElement(By.id("com.portonics.aarong:id/tvNext")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.portonics.aarong:id/tvNext")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.portonics.aarong:id/tvNext")).click();
        Thread.sleep(3000);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
