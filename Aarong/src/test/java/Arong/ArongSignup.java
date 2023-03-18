package Arong;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ArongSignup extends configArong{

    @Test(description = "Move to Signup Page",priority = 1)
    public void moveToSignupPage() throws InterruptedException {
        driver.findElement(AppiumBy.id("com.portonics.aarong:id/btnSignUp")).click();
        Thread.sleep(5000);

        String heading = "Create An Account";
        String actHeading  = driver.findElement(AppiumBy.id("com.portonics.aarong:id/tvHeading")).getText();
        Assert.assertEquals(actHeading,heading);
    }

    @Test(description = "isContinue button enable",priority = 2)
    public void isContinueButtonEnable() throws InterruptedException {
        WebElement btnContinue = driver.findElement(AppiumBy.id("com.portonics.aarong:id/btnContinue"));
        Boolean isEnable = btnContinue.isEnabled();

        if(isEnable){
            System.out.println("Continue button is Enable");
        }else {
            System.out.println("Error! Check your code...");
        }
    }

    @Test(description = "Create account without credential",priority = 3)
    public void createAccountWithoutCredential() throws InterruptedException {
        driver.findElement(AppiumBy.id("com.portonics.aarong:id/btnContinue")).click();
        Thread.sleep(5000);

        String err = "First Name is required.";
        String errMessage = driver.findElement(AppiumBy.id("com.portonics.aarong:id/textinput_error")).getText();

        Assert.assertEquals(errMessage,err);
        Thread.sleep(3000);

    }

    @Test(description = "Create account without FirstName",priority = 4)
    public void createAccountWithoutFName() throws InterruptedException {
        //First name
//        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Sabuz");
//        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Khan");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("01998499222");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.id("com.portonics.aarong:id/etGender")).click();
        Thread.sleep(3000);

        TouchAction action = new TouchAction(driver);
        //Coordinate    //Male: 290,1972    //Female: 318, 2151   //Other: 330, 2325
        action.press(PointOption.point(291, 1972));
        action.release();
        action.perform();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(3000);

        String err = "First Name is required.";
        String errMessage = driver.findElement(AppiumBy.id("com.portonics.aarong:id/textinput_error")).getText();

        Assert.assertEquals(errMessage,err);
        Thread.sleep(3000);

    }

    @Test(description = "Create account without LastName",priority = 5)
    public void createAccountWithoutLName() throws InterruptedException {
        driver.findElement(By.id("com.portonics.aarong:id/ivClose")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.portonics.aarong:id/btnSignUp")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Sabuz");
        Thread.sleep(3000);

        //Last name
//        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Khan");
//        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("01998499222");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.id("com.portonics.aarong:id/etGender")).click();
        Thread.sleep(3000);

        TouchAction action = new TouchAction(driver);
        //Coordinate    //Male: 290,1972    //Female: 318, 2151   //Other: 330, 2325
        action.press(PointOption.point(291, 1972));
        action.release();
        action.perform();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(3000);

        String err = "Last Name is required.";
        String errMessage = driver.findElement(AppiumBy.id("com.portonics.aarong:id/textinput_error")).getText();

        Assert.assertEquals(errMessage,err);
        Thread.sleep(3000);
    }


    @Test(description = "Create account without PhoneNumber",priority = 6)
    public void createAccountWithoutPhoneNumber() throws InterruptedException {
        driver.findElement(By.id("com.portonics.aarong:id/ivClose")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.portonics.aarong:id/btnSignUp")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Sabuz");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Khan");
        Thread.sleep(3000);

        //Phone Number
//        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("01998499222");
//        Thread.sleep(3000);

        driver.findElement(AppiumBy.id("com.portonics.aarong:id/etGender")).click();
        Thread.sleep(3000);

        TouchAction action = new TouchAction(driver);
        //Coordinate    //Male: 290,1972    //Female: 318, 2151   //Other: 330, 2325
        action.press(PointOption.point(291, 1972));
        action.release();
        action.perform();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(3000);

        String err = "Mobile Number is required.";
        String errMessage = driver.findElement(AppiumBy.id("com.portonics.aarong:id/textinput_error")).getText();

        Assert.assertEquals(errMessage,err);
        Thread.sleep(3000);
    }

    @Test(description = "Create account without gender",priority = 7)
    public void createAccountWithoutGender() throws InterruptedException {
        driver.findElement(By.id("com.portonics.aarong:id/ivClose")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.portonics.aarong:id/btnSignUp")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Sabuz");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Khan");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("01998499222");
        Thread.sleep(3000);

        //gender
//        driver.findElement(AppiumBy.id("com.portonics.aarong:id/etGender")).click();
//        Thread.sleep(3000);
//
//        TouchAction action = new TouchAction(driver);
//        //Coordinate    //Male: 290,1972    //Female: 318, 2151   //Other: 330, 2325
//        action.press(PointOption.point(291, 1972));
//        action.release();
//        action.perform();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(3000);

        String pageNumber = driver.findElement(By.id("com.portonics.aarong:id/tvPageNumber")).getText();
        Thread.sleep(3000);

        if(pageNumber.equals("2/2")){
            System.out.println("Gender is not Required");
        }else {
            System.out.println("Error! Check your code...");
        }

        driver.findElement(By.id("com.portonics.aarong:id/ivBack")).click();
        Thread.sleep(3000);

    }


    @Test(description = "Create account with credential",priority = 8)
    public void createAccountWithValidCredential() throws InterruptedException {
        driver.findElement(By.id("com.portonics.aarong:id/ivClose")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.portonics.aarong:id/btnSignUp")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Sabuz");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Khan");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("01998499222");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.id("com.portonics.aarong:id/etGender")).click();
        Thread.sleep(3000);

        TouchAction action = new TouchAction(driver);
        //Coordinate    //Male: 290,1972    //Female: 318, 2151   //Other: 330, 2325
        action.press(PointOption.point(291, 1972));
        action.release();
        action.perform();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(3000);

        String pageNumber = driver.findElement(By.id("com.portonics.aarong:id/tvPageNumber")).getText();
        Thread.sleep(3000);

        if (pageNumber.equals("2/2")) {
            System.out.println("Move to page 2");
        } else {
            System.out.println("Error! Check your code...");
        }
    }

//2nd page start

        @Test(description = "Click submit without 2nd page Credential", priority = 9)
        public void clickSubmitWithout2ndPageCredential() throws InterruptedException {
            driver.findElement(By.id("com.portonics.aarong:id/ivClose")).click();
            Thread.sleep(2000);
            driver.findElement(AppiumBy.id("com.portonics.aarong:id/btnSignUp")).click();
            Thread.sleep(5000);

            driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Sabuz");
            Thread.sleep(3000);

            driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Khan");
            Thread.sleep(3000);

            driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("01998499222");
            Thread.sleep(3000);

            driver.findElement(AppiumBy.id("com.portonics.aarong:id/etGender")).click();
            Thread.sleep(3000);

            TouchAction action = new TouchAction(driver);
            //Coordinate    //Male: 290,1972    //Female: 318, 2151   //Other: 330, 2325
            action.press(PointOption.point(291, 1972));
            action.release();
            action.perform();

            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
            Thread.sleep(3000);

            //Click submit without any credential

            driver.findElement(By.id("com.portonics.aarong:id/btnRegister")).click();
            Thread.sleep(3000);

            String err = "Email is required.";
            String errMessage = driver.findElement(AppiumBy.id("com.portonics.aarong:id/textinput_error")).getText();

            Assert.assertEquals(errMessage, err);
            Thread.sleep(3000);
    }

    @Test(description = "Create account without email", priority = 10)
    public void createAccountWithoutEmail() throws InterruptedException {
        driver.findElement(By.id("com.portonics.aarong:id/ivClose")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.portonics.aarong:id/btnSignUp")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Sabuz");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Khan");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("01998499222");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.id("com.portonics.aarong:id/etGender")).click();
        Thread.sleep(3000);

        TouchAction action = new TouchAction(driver);
        //Coordinate    //Male: 290,1972    //Female: 318, 2151   //Other: 330, 2325
        action.press(PointOption.point(291, 1972));
        action.release();
        action.perform();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(3000);

        //email
//        driver.findElement(By.id("com.portonics.aarong:id/etEmail")).sendKeys("ksolayman911@gmail.com");
//        Thread.sleep(3000);

        //birthday
        driver.findElement(By.id("com.portonics.aarong:id/etDob")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.portonics.aarong:id/month_navigation_fragment_toggle")).click();
        Thread.sleep(3000);
        //Select-year
        driver.findElement(AppiumBy.accessibilityId("Navigate to year 1996")).click();
        Thread.sleep(2000);
        //Select-Month
        String bithMonthYear = "FEBRUARY 1996";
        for(int i = 1; i<= 12; i++ ){
            String monthYear = driver.findElement(By.id("com.portonics.aarong:id/month_navigation_fragment_toggle")).getText();
            if(monthYear.equals(bithMonthYear)){
                break;
            }else{
                driver.findElement(AppiumBy.accessibilityId("Change to previous month")).click();
            }
        }
        Thread.sleep(3000);
        //Select-Date
        driver.findElement(AppiumBy.accessibilityId("Thu, Feb 29, 1996")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.portonics.aarong:id/confirm_button")).click();

        //password
        driver.findElement(By.id("com.portonics.aarong:id/etPassword")).sendKeys("123456");
        Thread.sleep(3000);

        //confirm password
        driver.findElement(By.id("com.portonics.aarong:id/etConfirmPassword")).sendKeys("123456");
        Thread.sleep(3000);

        //condition checkbox
        driver.findElement(By.id("com.portonics.aarong:id/cbSubscribe")).click();
        Thread.sleep(3000);

        //Submit Button
        driver.findElement(By.id("com.portonics.aarong:id/btnRegister")).click();
        Thread.sleep(3000);

        String err = "Email is required.";
        String errMessage = driver.findElement(AppiumBy.id("com.portonics.aarong:id/textinput_error")).getText();

        Assert.assertEquals(errMessage, err);
        Thread.sleep(3000);

    }

    @Test(description = "Create account without DoB", priority = 11)
    public void createAccountWithoutBirthDate() throws InterruptedException {
        driver.findElement(By.id("com.portonics.aarong:id/ivClose")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.portonics.aarong:id/btnSignUp")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Sabuz");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Khan");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("01983698887");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.id("com.portonics.aarong:id/etGender")).click();
        Thread.sleep(3000);

        TouchAction action = new TouchAction(driver);
        //Coordinate    //Male: 290,1972    //Female: 318, 2151   //Other: 330, 2325
        action.press(PointOption.point(291, 1972));
        action.release();
        action.perform();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(3000);

//        email
        driver.findElement(By.id("com.portonics.aarong:id/etEmail")).sendKeys("sabuz123@gmail.com");
        Thread.sleep(3000);

        //birthday
//       driver.findElement(By.id("com.portonics.aarong:id/etDob")).click();
//        Thread.sleep(3000);
//
//        driver.findElement(By.id("com.portonics.aarong:id/month_navigation_fragment_toggle")).click();
//        Thread.sleep(3000);
//        //Select-year
//        driver.findElement(AppiumBy.accessibilityId("Navigate to year 1996")).click();
//        Thread.sleep(2000);
//        //Select-Month
//        String bithMonthYear = "FEBRUARY 1996";
//        for(int i = 1; i<= 12; i++ ){
//            String monthYear = driver.findElement(By.id("com.portonics.aarong:id/month_navigation_fragment_toggle")).getText();
//            if(monthYear.equals(bithMonthYear)){
//                break;
//            }else{
//                driver.findElement(AppiumBy.accessibilityId("Change to previous month")).click();
//            }
//        }
//        Thread.sleep(3000);
//        //Select-Date
//        driver.findElement(AppiumBy.accessibilityId("Thu, Feb 29, 1996")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("com.portonics.aarong:id/confirm_button")).click();


        //password
        driver.findElement(By.id("com.portonics.aarong:id/etPassword")).sendKeys("123456");
        Thread.sleep(3000);

        //confirm password
        driver.findElement(By.id("com.portonics.aarong:id/etConfirmPassword")).sendKeys("123456");
        Thread.sleep(3000);

        //condition checkbox
        driver.findElement(By.id("com.portonics.aarong:id/cbSubscribe")).click();
        Thread.sleep(3000);

        //Submit Button
        driver.findElement(By.id("com.portonics.aarong:id/btnRegister")).click();
        Thread.sleep(3000);

        String err = "DoB is required.";
        String errMessage = driver.findElement(AppiumBy.id("com.portonics.aarong:id/tvOtpHeading")).getText();

        Thread.sleep(5000);
        driver.findElement(By.id("com.portonics.aarong:id/ivBack")).click();

        Assert.assertEquals(errMessage, err);
        Thread.sleep(3000);

    }


    @Test(description = "Create account without Password", priority = 12)
    public void createAccountWithoutPassword() throws InterruptedException {
        driver.findElement(By.id("com.portonics.aarong:id/ivClose")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.portonics.aarong:id/btnSignUp")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Sabuz");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Khan");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("01987689078");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.id("com.portonics.aarong:id/etGender")).click();
        Thread.sleep(3000);

        TouchAction action = new TouchAction(driver);
        //Coordinate    //Male: 290,1972    //Female: 318, 2151   //Other: 330, 2325
        action.press(PointOption.point(291, 1972));
        action.release();
        action.perform();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(3000);

//        email
        driver.findElement(By.id("com.portonics.aarong:id/etEmail")).sendKeys("ksolayman911@gmail.com");
        Thread.sleep(3000);

        //birthday
       driver.findElement(By.id("com.portonics.aarong:id/etDob")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.portonics.aarong:id/month_navigation_fragment_toggle")).click();
        Thread.sleep(3000);
        //Select-year
        driver.findElement(AppiumBy.accessibilityId("Navigate to year 1996")).click();
        Thread.sleep(2000);
        //Select-Month
        String bithMonthYear = "FEBRUARY 1996";
        for(int i = 1; i<= 12; i++ ){
            String monthYear = driver.findElement(By.id("com.portonics.aarong:id/month_navigation_fragment_toggle")).getText();
            if(monthYear.equals(bithMonthYear)){
                break;
            }else{
                driver.findElement(AppiumBy.accessibilityId("Change to previous month")).click();
            }
        }
        Thread.sleep(3000);
        //Select-Date
        driver.findElement(AppiumBy.accessibilityId("Thu, Feb 29, 1996")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.portonics.aarong:id/confirm_button")).click();


        //password
//        driver.findElement(By.id("com.portonics.aarong:id/etPassword")).sendKeys("123456");
//        Thread.sleep(3000);

        //confirm password
        driver.findElement(By.id("com.portonics.aarong:id/etConfirmPassword")).sendKeys("123456");
        Thread.sleep(3000);

        //condition checkbox
        driver.findElement(By.id("com.portonics.aarong:id/cbSubscribe")).click();
        Thread.sleep(3000);

        //Submit Button
        driver.findElement(By.id("com.portonics.aarong:id/btnRegister")).click();
        Thread.sleep(3000);

        String err = "Password is required.";
        String errMessage = driver.findElement(AppiumBy.id("com.portonics.aarong:id/textinput_error")).getText();

        Assert.assertEquals(errMessage, err);
        Thread.sleep(3000);

    }


    @Test(description = "Create account without Confirm Password", priority = 13)
    public void createAccountWithoutCPassword() throws InterruptedException {
        driver.findElement(By.id("com.portonics.aarong:id/ivClose")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.portonics.aarong:id/btnSignUp")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Sabuz");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Khan");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("01987689078");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.id("com.portonics.aarong:id/etGender")).click();
        Thread.sleep(3000);

        TouchAction action = new TouchAction(driver);
        //Coordinate    //Male: 290,1972    //Female: 318, 2151   //Other: 330, 2325
        action.press(PointOption.point(291, 1972));
        action.release();
        action.perform();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(3000);

//        email
        driver.findElement(By.id("com.portonics.aarong:id/etEmail")).sendKeys("ksolayman911@gmail.com");
        Thread.sleep(3000);

        //birthday
        driver.findElement(By.id("com.portonics.aarong:id/etDob")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.portonics.aarong:id/month_navigation_fragment_toggle")).click();
        Thread.sleep(3000);
        //Select-year
        driver.findElement(AppiumBy.accessibilityId("Navigate to year 1996")).click();
        Thread.sleep(2000);
        //Select-Month
        String bithMonthYear = "FEBRUARY 1996";
        for(int i = 1; i<= 12; i++ ){
            String monthYear = driver.findElement(By.id("com.portonics.aarong:id/month_navigation_fragment_toggle")).getText();
            if(monthYear.equals(bithMonthYear)){
                break;
            }else{
                driver.findElement(AppiumBy.accessibilityId("Change to previous month")).click();
            }
        }
        Thread.sleep(3000);
        //Select-Date
        driver.findElement(AppiumBy.accessibilityId("Thu, Feb 29, 1996")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.portonics.aarong:id/confirm_button")).click();


        //password
        driver.findElement(By.id("com.portonics.aarong:id/etPassword")).sendKeys("123456");
        Thread.sleep(3000);

        //confirm password
//        driver.findElement(By.id("com.portonics.aarong:id/etConfirmPassword")).sendKeys("123456");
//        Thread.sleep(3000);

        //condition checkbox
        driver.findElement(By.id("com.portonics.aarong:id/cbSubscribe")).click();
        Thread.sleep(3000);

        //Submit Button
        driver.findElement(By.id("com.portonics.aarong:id/btnRegister")).click();
        Thread.sleep(3000);

        String err = "Confirm Password is required.";
        String errMessage = driver.findElement(AppiumBy.id("com.portonics.aarong:id/textinput_error")).getText();

        Assert.assertEquals(errMessage, err);
        Thread.sleep(3000);

    }


    @Test(description = "Create account without Condition", priority = 14)
    public void createAccountWithoutCondition() throws InterruptedException {
//        driver.findElement(By.id("com.portonics.aarong:id/ivClose")).click();
//        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.portonics.aarong:id/btnSignUp")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Sabuz");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Khan");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("01987689078");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.id("com.portonics.aarong:id/etGender")).click();
        Thread.sleep(3000);

        TouchAction action = new TouchAction(driver);
        //Coordinate    //Male: 290,1972    //Female: 318, 2151   //Other: 330, 2325
        action.press(PointOption.point(291, 1972));
        action.release();
        action.perform();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(3000);

//        email
        driver.findElement(By.id("com.portonics.aarong:id/etEmail")).sendKeys("ksolayman911@gmail.com");
        Thread.sleep(3000);

        //birthday
        driver.findElement(By.id("com.portonics.aarong:id/etDob")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.portonics.aarong:id/month_navigation_fragment_toggle")).click();
        Thread.sleep(3000);
        //Select-year
        driver.findElement(AppiumBy.accessibilityId("Navigate to year 1996")).click();
        Thread.sleep(2000);
        //Select-Month
        String bithMonthYear = "FEBRUARY 1996";
        for(int i = 1; i<= 12; i++ ){
            String monthYear = driver.findElement(By.id("com.portonics.aarong:id/month_navigation_fragment_toggle")).getText();
            if(monthYear.equals(bithMonthYear)){
                break;
            }else{
                driver.findElement(AppiumBy.accessibilityId("Change to previous month")).click();
            }
        }
        Thread.sleep(3000);
        //Select-Date
        driver.findElement(AppiumBy.accessibilityId("Thu, Feb 29, 1996")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.portonics.aarong:id/confirm_button")).click();


        //password
        driver.findElement(By.id("com.portonics.aarong:id/etPassword")).sendKeys("123456");
        Thread.sleep(3000);

        //confirm password
        driver.findElement(By.id("com.portonics.aarong:id/etConfirmPassword")).sendKeys("123456");
        Thread.sleep(3000);

        //condition checkbox
//        driver.findElement(By.id("com.portonics.aarong:id/cbSubscribe")).click();
//        Thread.sleep(3000);

        //Submit Button
        driver.findElement(By.id("com.portonics.aarong:id/btnRegister")).click();
        Thread.sleep(3000);

        String err = "Please accept Terms & Condition.";
        String errMessage = driver.findElement(AppiumBy.id("com.portonics.aarong:id/snackbar_text")).getText();

        Assert.assertEquals(errMessage, err);
        Thread.sleep(3000);

    }


    @Test(description = "Create account with All Valid Credential", priority = 15)
    public void createAccountWithAllValidCredential() throws InterruptedException {
        driver.findElement(By.id("com.portonics.aarong:id/ivClose")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.portonics.aarong:id/btnSignUp")).click();
        Thread.sleep(5000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Solayman");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Khan");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("01515210371");
        Thread.sleep(3000);

        driver.findElement(AppiumBy.id("com.portonics.aarong:id/etGender")).click();
        Thread.sleep(3000);

        TouchAction action = new TouchAction(driver);
        //Coordinate    //Male: 290,1972    //Female: 318, 2151   //Other: 330, 2325
        action.press(PointOption.point(291, 1972));
        action.release();
        action.perform();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(3000);

//        email
        driver.findElement(By.id("com.portonics.aarong:id/etEmail")).sendKeys("solayman.cev@gmail.com");
        Thread.sleep(3000);

        //birthday
        driver.findElement(By.id("com.portonics.aarong:id/etDob")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.portonics.aarong:id/month_navigation_fragment_toggle")).click();
        Thread.sleep(3000);
        //Select-year
        driver.findElement(AppiumBy.accessibilityId("Navigate to year 1996")).click();
        Thread.sleep(2000);
        //Select-Month
        String bithMonthYear = "FEBRUARY 1996";
        for(int i = 1; i<= 12; i++ ){
            String monthYear = driver.findElement(By.id("com.portonics.aarong:id/month_navigation_fragment_toggle")).getText();
            if(monthYear.equals(bithMonthYear)){
                break;
            }else{
                driver.findElement(AppiumBy.accessibilityId("Change to previous month")).click();
            }
        }
        Thread.sleep(3000);
        //Select-Date
        driver.findElement(AppiumBy.accessibilityId("Thu, Feb 29, 1996")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.portonics.aarong:id/confirm_button")).click();


        //password
        driver.findElement(By.id("com.portonics.aarong:id/etPassword")).sendKeys("solayman12345");
        Thread.sleep(3000);

        //confirm password
        driver.findElement(By.id("com.portonics.aarong:id/etConfirmPassword")).sendKeys("solayman12345");
        Thread.sleep(3000);

        //condition checkbox
        driver.findElement(By.id("com.portonics.aarong:id/cbSubscribe")).click();
        Thread.sleep(3000);

        //Submit Button
        driver.findElement(By.id("com.portonics.aarong:id/btnRegister")).click();
        Thread.sleep(3000);

        String err = "Login.";
        String errMessage = driver.findElement(AppiumBy.id("com.portonics.aarong:id/tvOtpHeading")).getText();

        Assert.assertEquals(errMessage, err);
        Thread.sleep(120000);

    }

}
