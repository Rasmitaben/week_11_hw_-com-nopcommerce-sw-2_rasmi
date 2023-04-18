package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
  /*  1. userShouldNavigateToLoginPageSuccessfully
* click on the ‘Login’ link
* Verify the text ‘Welcome, Please Sign
    In!’*/
@Test

public void userShouldNavigateToLoginPageSuccessfully(){
    // click on the ‘Login’ link
    driver.findElement(By.linkText("Log in")).click();
    // Verify the text ‘Welcome, Please Sign
    //    In!
    String expectedMessage = "welcome back!";
    WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
    String actualMessage = actualTextElement.getText();
    Assert.assertEquals("Text message",expectedMessage,actualMessage);
}

/*
2. userShouldLoginSuccessfullyWithValidCredentials
* click on the ‘Login’ link
* Enter valid username
* Enter valid password
* Click on ‘LOGIN’ button
* Verify the ‘Log out’ text is display
 */
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("robertjacson10@gmail.com");
        //Enter valid password
        driver.findElement(By.id("Password")).sendKeys("rjacson123");
       //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[contains(text(),'Log in')")).click();
        //Verify the ‘Log out’ text is display
        String expectedMessage = "Log out";
        WebElement actualTextElement = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Error message",expectedMessage,actualMessage);
    }
    /*
    3. verifyTheErrorMessage
* click on the ‘Login’ link
* Enter invalid username
* Enter invalid password
* Click on Login button
* Verify the error message ‘Login was unsuccessful.
Please correct the errors and try again. No customer account found’

     */
    @Test
    public void verifyTheErrorMessage() {
        //click on the login link
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();

        //Find email element
        driver.findElement(By.id("Email")).sendKeys("magnusjohn12@gmail.com");

        // Find password element
        driver.findElement(By.id("Password")).sendKeys("1234567");

        //click on login button
        WebElement loginButton = driver.findElement(By.cssSelector("button.button-1.login-button"));
        loginButton.click();

        //Expected results
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        //Verify the error message
        WebElement actualTextElement = driver.findElement(By.cssSelector("div.message-error.validation-summary-errors"));
        String actualMessage = actualTextElement.getText();
        //Validation of actual and expected results
        Assert.assertEquals("Error message", expectedMessage, actualMessage);

    }
}
