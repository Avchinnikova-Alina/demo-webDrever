import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HurtMePlenty {
    @Test
    public void HelloWeb() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cloud.google.com/");
        String imputConsoleXpath = "/html/body/section/devsite-header/div/div[1]/div/div/div[2]/devsite-search/form/div[1]/div/input";
        WebElement imputConsoleElement = driver.findElement(By.xpath(imputConsoleXpath));
        imputConsoleElement.sendKeys("Google Cloud Platform Pricing Calculator");
        imputConsoleElement.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String submitSelectSearchXpath = "//*[@id=\"___gcse_0\"]/div/div/div/div[5]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/div/a";
        WebElement submitSelectSearchElement = driver.findElement(By.xpath(submitSelectSearchXpath));
        submitSelectSearchElement.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement frame = driver.findElement(By.xpath("//iframe[@src=\"https://cloud.google.com/frame/products/calculator/index_d6a98ba38837346d20babc06ff2153b68c2990fa24322fe52c5f83ec3a78c6a0.frame?hl=ru\" ]"));
        driver.switchTo().frame(frame);
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@src=\"https://cloudpricingcalculator.appspot.com\"]"));
        driver.switchTo().frame(frame1);

        String submitComputeEngineXpath = "//*[@id=\"tab-item-1\"]/div[1]/div";
        WebElement submitComputeEngineElement = driver.findElement(By.xpath(submitComputeEngineXpath));
        submitComputeEngineElement.click();

        String inputNumberOfInstancesXpath = "//*[@id=\"input_96\"]";
        WebElement inputNumberOfInstancesElement = driver.findElement(By.xpath(inputNumberOfInstancesXpath));
        inputNumberOfInstancesElement.sendKeys("4");

        String submitOperationSSXpath = "//*[@id=\"select_value_label_88\"]/span[1]/div";
        WebElement submitOperationSSElement = driver.findElement(By.xpath(submitOperationSSXpath));
        submitOperationSSElement.click();

        String submitOperationSSFreeXpath = "//*[@id=\"select_option_98\"]/div[1]";
        WebElement submitOperationSSFreeElement = driver.findElement(By.xpath(submitOperationSSFreeXpath));
        submitOperationSSFreeElement.click();

        String submitProvisioningModelXpath = "//*[@id=\"select_value_label_89\"]/span[1]/div";
        WebElement submitProvisioningModelElement = driver.findElement(By.xpath(submitProvisioningModelXpath));
        submitProvisioningModelElement.click();

        String submitProvisioningModelRegXpath = "//*[@id=\"select_option_111\"]/div[1]";
        WebElement submitProvisioningModelRegElement = driver.findElement(By.xpath(submitProvisioningModelRegXpath));
        submitProvisioningModelRegElement.click();

        String submitSeriesXpath = "//*[@id=\"select_value_label_91\"]/span[1]/div";
        WebElement submitSeriesElement = driver.findElement(By.xpath(submitSeriesXpath));
        submitSeriesElement.click();
    }
}
