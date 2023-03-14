package eCommerce;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class EcommerceRegistration extends ConfigApk {

    public void scrollDown(){

        Dimension dim = driver.manage().window().getSize();
        int startX = dim.getHeight()/2;
        int endX = dim.getWidth()/2;

        int startY =(int) (dim.getHeight()*.75);
        int endY = (int) (dim.getHeight()*.20);

        TouchAction touch = new TouchAction(driver);
        touch.press(PointOption.point(startX,startY)).waitAction()
                .moveTo(PointOption.point(endX,endY)).release().perform();

    }

    public void scrollUp(){

        Dimension dim = driver.manage().window().getSize();
        int startX = dim.getHeight()/2;
        int endX = dim.getWidth()/2;

        int startY =(int) (dim.getHeight()*.20);
        int endY = (int) (dim.getHeight()*.75);

        TouchAction touch = new TouchAction(driver);
        touch.press(PointOption.point(startX,startY)).waitAction()
                .moveTo(PointOption.point(endX,endY)).release().perform();

    }

    @Test(description = "Get registration page link", priority = 1)
    public void getRegistrationPageLink(){

        driver.findElement(AppiumBy.accessibilityId("App")).click();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
                "/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.drawerlayout" +
                ".widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx" +
                ".appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView")).click();

        String text = "Not Registered ? Register Now !";
        String actText = driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/tv_register")).getText();

        Assert.assertEquals(actText,text);

    }

    @Test(description = "Is registration page link displayed", priority = 2)
    public void isRegistrationPageLinkDisplayed() throws InterruptedException {

        boolean isDisplayed = driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/tv_register")).isDisplayed();
        Thread.sleep(5000);

        if (isDisplayed){
            System.out.println("Registration link is displayed");
        }else {
            System.out.println("Registration link is not displayed");
        }

    }

    @Test(description = "Get registration page link enable", priority = 3)
    public void isRegistrationPageLinkEnable() throws InterruptedException {

        boolean isEnable = driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/tv_register")).isEnabled();
        Thread.sleep(5000);

        if(isEnable){
            System.out.println("Registration link is enabled");
        }else {
            System.out.println("Registration link is not enable");
        }
    }


    @Test(description = "isRegistered button displayed", priority = 4)
    public void isRegisterButtonDisplayed() throws InterruptedException {

        driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/tv_register")).click();
        Thread.sleep(5000);

        boolean isDisplayed = driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/btn_register")).isDisplayed();
        Thread.sleep(5000);

        if (isDisplayed){
            System.out.println("Register button is displayed");
        }else {
            System.out.println("Error!Check your code...");
        }

    }


    @Test(description = "isRegistered button enabled", priority = 5)
    public void isRegisterButtonEnabled() throws InterruptedException {

        boolean isEnable = driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/btn_register")).isEnabled();
        Thread.sleep(5000);

        if (isEnable){
            System.out.println("Register button is enable");
        }else {
            System.out.println("Error!Check your code...");
        }

    }

    @Test(description = "isLogin link displayed", priority = 6)
    public void isLoginLinkDisplayed() throws InterruptedException {

        boolean isDisplayed = driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/tv_login")).isDisplayed();
        Thread.sleep(5000);

        if (isDisplayed){
            System.out.println("Login button is displayed");
        }else {
            System.out.println("Error!Check your code...");
        }

    }


    @Test(description = "isLogin link enabled", priority = 7)
    public void isLoginLinkEnabled() throws InterruptedException {

        boolean isDisplayed = driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/tv_login")).isEnabled();
        Thread.sleep(5000);

        if (isDisplayed){
            System.out.println("Login button is enable");
        }else {
            System.out.println("Error!Check your code...");
        }
    }



    @Test(description = "Get registered with valid credential", priority = 8)
    public void getRegisterWithValidCredential() throws InterruptedException {

        driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/et_register_username")).sendKeys("Sabuz");
        Thread.sleep(5000);

        driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/et_register_mno")).sendKeys("1811122233");
        Thread.sleep(5000);

        driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/et_register_email")).sendKeys("sabuz@gmail.com");
        Thread.sleep(5000);

        driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/et_register_password")).sendKeys("123456");
        Thread.sleep(5000);

        driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/btn_register")).click();
        Thread.sleep(5000);

        String text = "MY DETAILS";
        String actText = driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/btn_mydetails")).getText();
        Assert.assertEquals(actText,text);

        if(actText.equals(text)){
            System.out.println("Registration is Successful");
        }else {
            System.out.println("Error! Check your code again...");
        }
    }



}
