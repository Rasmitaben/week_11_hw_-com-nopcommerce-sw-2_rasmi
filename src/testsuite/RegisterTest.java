package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.UUID;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    /*1. UserShouldNavigateToRegisterPageSuccessfully
     * click on the ‘Register’ link
     * Verify the text ‘Register’
     */
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //click on 'Register' link
        WebElement registerLink = driver.findElement(By.className("ico-register"));
        registerLink.click();

        // Verify the text 'Register'
        String expectedText = "Register";
        WebElement actualTextElement = driver.findElement(By.className("page-title"));
        String actualText = actualTextElement.getText();
        System.out.println(actualText);
        Assert.assertEquals("Text is not displayed", expectedText, actualText);
    }

    /*2. userShouldRegisterAccountSuccessfully
     * click on the ‘Register’ link
     * Select gender radio button
     * Enter First name
     * Enter Last name
     * Select Day Month and Year
     * Enter Email address
     * Enter Password
     * Enter Confirm password
     * Click on REGISTER button
     * Verify the text 'Your registration completed’
     */

    @Test
    public void userShouldRegisterAccountSuccessfully() {

        //click on 'Register' link
        WebElement register = driver.findElement(By.className("ico-register"));
        register.click();

        //Click on  gender male radio button
        WebElement genderButton = driver.findElement(By.className("forcheckbox"));
        genderButton.click();

        //Click on gender female button
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();


        //Enter First name
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John");

        //Enter Last name
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Smith");

        //Select Day
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("7");

        //Select Month
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("March");

        //Select  Year
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1999");

        //Generate a random email
        final String randomEmail = randomEmail();
        //Enter Email address
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(randomEmail);

        //Enter Password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456789");

        //Enter Confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456789");

        //Click on REGISTER button
        WebElement registerButton = driver.findElement(By.xpath("//button[@id='register-button']"));
        registerButton.click();

        //Verify the text 'Your registration completed

        String expectedMessage = "Your registration completed";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Text is not displayed", expectedMessage, actualMessage);

    }

    private static String randomEmail() {
        return "random-" + UUID.randomUUID().toString() + "@example.com";
    }

    @After
    public void tearDown() {
        closeBrowser();

    }
}




