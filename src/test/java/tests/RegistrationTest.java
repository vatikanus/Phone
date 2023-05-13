package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    @BeforeMethod
    public void preCondition() {
        if (app.getUser().isLogged()) {
            app.getUser().logout();
        }
    }


    @Test
    public void registrationTestPositive() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        String email = "nik" + i + "@gmail.com";
        String password = "Nik12345$";

        app.getUser().openLoginRegistrationForm();
        app.getUser().fillLoginRegistrationForm(email, password);
        app.getUser().submitRegistrationForm();

       // Assert.assertTrue(isElementPresent(By.xpath("//button[text()='Sign Out']")));
        Assert.assertTrue(app.getUser().isLogged());
    }


    @Test
    public void registrationWrongEmail() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        String email = "nik" + i + "gmail.com";
        String password = "Nik12345$";

        app.getUser().openLoginRegistrationForm();
        app.getUser().fillLoginRegistrationForm(email, password);
        app.getUser().submitRegistrationForm();

        //Assert.assertFalse(isElementPresent(By.xpath("//button[text()='Sign Out']")));
        Assert.assertFalse(app.getUser().isLogged());
    }


}













