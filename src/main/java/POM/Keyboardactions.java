package POM;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static org.testng.AssertJUnit.assertEquals;

public class Keyboardactions {
    private WebDriver driver;
    public Keyboardactions(WebDriver driver){this.driver = driver;}

    public void all() throws InterruptedException{
        Thread.sleep(3000);
        WebElement searchField = driver.findElement(By.name("q"));

        Actions builder = new Actions(driver);

        Action seriesOfActions = builder
                .moveToElement(searchField)
                .click()
                .sendKeys("India")
                .keyDown(searchField, Keys.ENTER)
                .build();

        Thread.sleep(4000);
        seriesOfActions.perform();

        Thread.sleep(4000);

    }

}
