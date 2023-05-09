import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTest extends TestBase {


    @Test
    public void registrationTestPositive()
    {
        int i = (int) (System.currentTimeMillis()/1000)%3600;
        String email = "nik" + i + "@gmail.com";
        String password = "Nik12345$";

        openLoginRegistrationForm();
        fillLoginRegistrationForm(email,password);
        submitRegistrationForm();
        Assert.assertTrue(isElementPresent(By.xpath("//button[text()='Sign Out']")));
    }


    @Test
   public void registrationWrongEmail()
    {
        int i = (int) (System.currentTimeMillis()/1000)%3600;
        String email = "nik" + i + "gmail.com";
        String password = "Nik12345$";

        openLoginRegistrationForm();
        fillLoginRegistrationForm(email,password);
        submitRegistrationForm();
        Assert.assertFalse(isElementPresent(By.xpath("//button[text()='Sign Out']")));
    }



}













