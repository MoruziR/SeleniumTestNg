package Pages;

import Tests.SeleniumTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;

import static Tests.SeleniumTest.*;

import static Tests.SeleniumTest.driver;

public class ProductsPages {
    public static String formalShoes_xpath = "/html/body/div[2]/center/h2";
    public static String sportsShoes_xpath = "/html/body/div[3]/center/h2";
    public static String sneakers_xpath = "/html/body/div[4]/center/h2";

    public static String formalShoesdrpdown_xpath = "/html/body/div[2]/center/div/i[1]";

    public static String sportsShoesdrpdown_xpath = "/html/body/div[3]/center/div/i[1]";

    public static String sneakerdrpdown_xpath = "/html/body/div[4]/center/div/i[1]";

    public static String formalShoes_firstshoename = "/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static String sportsShoes_firstshoename = "/html/body/div[3]/table/tbody/tr[1]/td[1]";

    public static String sneaker_firstshoename = "/html/body/div[4]/table/tbody/tr[1]/td[1]";

    public static void formalShoes_verifyTitle() throws IOException {
        String expectedTitleFS = "Formal Shoes";
        String actualTitleFS = driver.findElement(By.xpath(formalShoes_xpath)).getText();
        Assert.assertEquals(expectedTitleFS, actualTitleFS);
        if (expectedTitleFS.equals(actualTitleFS)){
            test.log(Status.PASS, "Test Passed for title verification of Formal Shoes");
            test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Passed");
        } else if (false) {
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
    }

    public static void sportsShoes_verifyTitle() throws IOException, InterruptedException {
        Thread.sleep(2000);
        String expectedTitleSS = "Sports Shoes";
        String actualTitleSS = driver.findElement(By.xpath(sportsShoes_xpath)).getText();
        Assert.assertEquals(expectedTitleSS, actualTitleSS);
        if (expectedTitleSS.equals(actualTitleSS)){
            test.log(Status.PASS, "Test Passed for title verification of Sports Shoes");
            test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Failed");
        } else if (false) {
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
    }
    public static void sneakers_verifyTitle() throws IOException, InterruptedException {
        Thread.sleep(2000);
        String expectedTitleSn = "Sneakers";
        String actualTitleSn = driver.findElement(By.xpath(sneakers_xpath)).getText();
        Assert.assertEquals(expectedTitleSn, actualTitleSn);
        if (expectedTitleSn.equals(actualTitleSn)){
            test.log(Status.PASS, "Test Passed for title verification of Sneakers");
            test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Failed");
        } else if (false) {
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
    }
    public static void formalShoes_firstshoe_verify() throws IOException, InterruptedException {
        Thread.sleep(2000);
        String expectedFirstFormalShoe = "   Classic Cheltenham";
        driver.findElement(By.xpath(formalShoesdrpdown_xpath)).click();
        String actualFirstFormalShoe = driver.findElement(By.xpath(formalShoes_firstshoename)).getText();
        Assert.assertEquals(expectedFirstFormalShoe, actualFirstFormalShoe);
        if (expectedFirstFormalShoe.equals(actualFirstFormalShoe)){
            test.log(Status.PASS, "Test Passed for first shoe name of Formal shoe i.e Classic Cheltanham");
            test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Failed");
        } else if (false) {
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
    }
    public static void sportsShoes_firstshoe_verify() throws IOException, InterruptedException {
        Thread.sleep(2000);
        String expectedFirstSportShoe = "   Ultimate";
        driver.findElement(By.xpath(sportsShoesdrpdown_xpath)).click();
        String actualFirstSportShoe = driver.findElement(By.xpath(sportsShoes_firstshoename)).getText();
        Assert.assertEquals(expectedFirstSportShoe, actualFirstSportShoe);
        if (expectedFirstSportShoe.equals(actualFirstSportShoe)) {
            test.log(Status.PASS, "Test Passed for first shoe name of Sports shoe i.e Ultimate");
            test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Failed");
        } else if (false) {
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
    }
        public static void sneakers_firstshoe_verify() throws IOException, InterruptedException {
        Thread.sleep(2000);
        String expectedsneaker = "   Archivo";
        driver.findElement(By.xpath(sneakerdrpdown_xpath)).click();
        String actualsneaker = driver.findElement(By.xpath(sneaker_firstshoename)).getText();
        Assert.assertEquals(expectedsneaker, actualsneaker);
        if (expectedsneaker.equals(actualsneaker)){
            test.log(Status.PASS, "Test Passed for first shoe name of Sports shoe i.e Ultimate");
            test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Failed");
        } else if (false) {
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());

    }
}}



