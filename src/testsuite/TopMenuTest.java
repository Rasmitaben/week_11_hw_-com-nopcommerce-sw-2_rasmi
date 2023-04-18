package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    /*1. userShouldNavigateToComputerPageSuccessfully
     * click on the ‘Computers’ Tab
     * Verify the text ‘Computers’*/
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        // click on the 'computers' Tab
        WebElement computerLink = driver.findElement(By.linkText("Computers"));
        computerLink.click();

        //verify the text computer
        String expectedMessage = "Computers";
        WebElement actualTextElement = driver.findElement(By.className("page-title"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Text is not visible", expectedMessage, actualMessage);

    }

    /*2. userShouldNavigateToElectronicsPageSuccessfully
     * click on the ‘Electronics’ Tab
     * Verify the text ‘Electronics’
     */

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // Click on the 'Electronics' Tab
        WebElement electronicsLink = driver.findElement(By.linkText("Electronics"));
        electronicsLink.click();

        //Verify the text 'Electronics'
        String expectedMessage = "Electronics";
        WebElement actualTextElement = driver.findElement(By.className("page-title"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Text is not displayed", expectedMessage, actualMessage);
    }
        /*3.userShouldNavigateToApparelPageSuccessfully
         * click on the ‘Apparel’ Tab
         * Verify the text ‘Apparel’*/
        @Test
        public void userShouldNavigateToApparelPageSuccessfully(){
            //click on the 'Apparel' tab
            WebElement apparelLink = driver.findElement(By.linkText("Apparel"));
            apparelLink.click();

            //Verify the text 'Apparel'
            String expectedMessage = "Apparel";
            WebElement actualTextElement = driver.findElement(By.className("page-title"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Text is not displayed", expectedMessage, actualMessage);
        }

        /*4.userShouldNavigateToDigitalDownloadsPageSuccessfully
         * click on the ‘Digital downloads’ Tab
         * Verify the text ‘Digital downloads’
         */

        @Test
        public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
            //click on the 'Digital downloads' tab
            WebElement digitalLink = driver.findElement(By.linkText("Digital downloads"));
            digitalLink.click();

            //Verify the text ‘Digital downloads’
            String expectedMessage = "Digital downloads";
            WebElement actualTextElement = driver.findElement(By.className("page-title"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Text is not displayed", expectedMessage, actualMessage);
        }

        /*5. userShouldNavigateToBooksPageSuccessfully
         * click on the ‘Books’ Tab
         * Verify the text ‘Books’
         *  */
        @Test
        public void userShouldNavigateToBooksPageSuccessfully() {
            //click on the ‘Books’ Tab
            WebElement bookLink = driver.findElement(By.linkText("Books"));
            bookLink.click();

            //Verify the text ‘Books’
            String expectedMessage = "Books";
            WebElement actualTextElement = driver.findElement(By.className("page-title"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Text is not displayed", expectedMessage, actualMessage);
        }

        /*6. userShouldNavigateToJewelryPageSuccessfully
         * click on the ‘Jewelry’ Tab
         * Verify the text ‘Jewelry’
         */
        @Test
        public void userShouldNavigateToJewelryPageSuccessfully() {
            //click on the ‘Jewelry’ Tab
            WebElement jewelryLink = driver.findElement(By.linkText("Jewelry"));
            jewelryLink.click();

            //Verify the text ‘Jewelry’
            String expectedMessage = "Jewelry";
            WebElement actualTextElement = driver.findElement(By.className("page-title"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Text is not displayed", expectedMessage, actualMessage);

        }

        /*7. userShouldNavigateToGiftCardsPageSuccessfully
         * click on the ‘Gift Cards’ Tab
         * Verify the text ‘Gift Cards’
         */
        @Test
        public void userShouldNavigateToGiftCardsPageSuccessfully() {
            //click on the ‘Gift Cards’ Tab
            WebElement giftCardLink = driver.findElement(By.linkText("Gift Cards"));
            giftCardLink.click();

            //Verify the text ‘Gift Cards’
            String expectedMessage = "Gift Cards";
            WebElement actualTextElement = driver.findElement(By.className("page-title"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Text is not displayed", expectedMessage, actualMessage);

        }

        @After
        public void tearDown() {
            //closeBrowser();

        }


    }


