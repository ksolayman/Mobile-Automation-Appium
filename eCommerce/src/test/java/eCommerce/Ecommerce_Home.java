package eCommerce;

import io.appium.java_client.*;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;


public class
Ecommerce_Home extends ConfigApk {

//Scroll down or up
    public void scrollDown(){
        Dimension sz = driver.manage().window().getSize();
        int startX = sz.getWidth()/2;
        int endX = sz.getWidth()/2;

        int startY = (int) (sz.getHeight()*.75);
        int endY = (int) (sz.getHeight()*.20);

        TouchAction touch = new TouchAction(driver);
        touch.press(PointOption.point(startX,startY)).waitAction()
                .moveTo(PointOption.point(endX,endY)).release().perform();

    }

    public void scrollUp(){
        Dimension sz = driver.manage().window().getSize();
        int startX = sz.getWidth()/2;
        int endX = sz.getWidth()/2;

        int startY = (int) (sz.getHeight()*.20);
        int endY = (int) (sz.getHeight()*.75);

        TouchAction touch = new TouchAction(driver);
        touch.press(PointOption.point(startX,startY)).waitAction()
                .moveTo(PointOption.point(endX,endY)).release().perform();

    }

    @Test(description = "Click App Dropdown", priority = 1)
    public void clickAppDropdown() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("App")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.accessibilityId("App")).click();
    }

    @Test(description = "Click New Arrival", priority = 2)
    public void clickNewArrival() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("App")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.drawerlayout." +
                "widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx." +
                "appcompat.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
        Thread.sleep(5000);
    }


    @Test(description = "Click Sale", priority = 3)
    public void clickSale() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("App")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
                "/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.drawerlayout" +
                ".widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx" +
                ".appcompat.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
        Thread.sleep(5000);
    }

    @Test(description = "isSearch icon displayed", priority = 4)
    public void isDisplayedSearchIcon() throws InterruptedException {
        boolean isDisplayed = driver.findElement(AppiumBy.id("com.studiobluelime.ecommerceapp:id/fab_ma_search")).isDisplayed();
        Thread.sleep(3000);
        try {
            if(isDisplayed){
                System.out.println("Search icon is displayed");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Test(description = "Search", priority = 5)
    public void clickSearch() throws InterruptedException {
        driver.findElement(AppiumBy.id("com.studiobluelime.ecommerceapp:id/fab_ma_search")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/search_src_text")).sendKeys("shirt");
        Thread.sleep(3000);
        driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/btn_filter")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
        Thread.sleep(5000);

    }


    @Test(description = "Click Category & Sub-category", priority = 6)
    public void clickCategorySubcategory() throws InterruptedException {
//Call scroll down function
        scrollDown();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
                "/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.drawerlayout" +
                ".widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout" +
                "/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/androidx" +
                ".recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android" +
                ".widget.LinearLayout/android.widget.ImageView")).click();
                Thread.sleep(5000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
                "/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup" +
                "/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView" +
                "/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget" +
                ".ImageView")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
                "/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup" +
                "/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android" +
                ".widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
        Thread.sleep(3000);

        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
        Thread.sleep(3000);

        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
        Thread.sleep(3000);

    }

    @Test(description = "add to cart", priority = 6)
    public void addToCart() throws InterruptedException {
        driver.findElement(AppiumBy.id("com.studiobluelime.ecommerceapp:id/fab_ma_search")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/search_src_text")).sendKeys("Note 9 Pro");
        Thread.sleep(3000);
        driver.findElement(By.id("com.studiobluelime.ecommerceapp:id/btn_filter")).click();
        Thread.sleep(5000);

        scrollDown();
        Thread.sleep(3000);
        scrollDown();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[1]/android.widget.TextView")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageButton")).click();
        Thread.sleep(5000);
    }


    @Test(description = "view cart", priority = 6)
    public void viewCart() throws InterruptedException {

        scrollDown();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[1]/android.widget.TextView")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageButton")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Cart\"]")).click();
        Thread.sleep(5000);
    }


}
