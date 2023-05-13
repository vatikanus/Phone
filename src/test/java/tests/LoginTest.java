package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @Test
    public void loginPositiveTest()
    {
        /*WebElement loginBtn = wd.findElement(By.xpath("//*[.='LOGIN']"));
        loginBtn.click();

        WebElement emailInput= wd.findElement(By.xpath("//input[1]"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys("noa@gmail.com");

        WebElement passwordInput = wd.findElement(By.xpath("//input[2]"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("Nnoa12345$");

        (wd.findElement(By.xpath("//button[1]"))).click();

        //Assert.assertTrue(wd.findElements(By.xpath("//button[text()='Sign Out']")).size()>0);*/




    }
    @Test
    public void loginTest2()
    {
        String email = "noa@gmail.com";
        String password = "Nnoa12345$";

       app.getUser(). openLoginRegistrationForm();
        app.getUser().fillLoginRegistrationForm(email,password);
        app.getUser().submitLogin();
        app.getUser().pause(5000);
        Assert.assertTrue(app.getUser().isLogged());


    }




}
