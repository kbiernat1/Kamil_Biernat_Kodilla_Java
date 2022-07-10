package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    public static final String XPATH_WAIT = "//select[1]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com/");

        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();

        while (!driver.findElement(By.xpath(XPATH_WAIT)).isDisplayed());

        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoard1 = new Select(selectCombo1);
        selectBoard1.selectByIndex(7);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoard2 = new Select(selectCombo2);
        selectBoard2.selectByIndex(7);

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoard3 = new Select(selectCombo3);
        selectBoard3.selectByIndex(5);
    }
}
