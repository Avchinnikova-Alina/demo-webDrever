import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICanWin {
    @Test
    public void HelloWeb() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com/");
        String imputNewPasteXpath="//*[@id=\"postform-text\"]";
        WebElement imputNewPasteElement=driver.findElement(By.xpath(imputNewPasteXpath));
        imputNewPasteElement.sendKeys("Hello from WebDriver");

        String submitPasteExpirationXpath="//*[@id=\"w0\"]/div[5]/div[1]/div[4]/div/span/span[1]/span/span[2]";
        WebElement submitPasteExpirationElement=driver.findElement(By.xpath(submitPasteExpirationXpath));
        submitPasteExpirationElement.click();

        String submitTenMinXpath="//*[contains(@id,'select2-postform-expiration-result-') and contains(@id, '-10M')]";
        WebElement submitTenMinElement=driver.findElement(By.xpath(submitTenMinXpath));
        submitTenMinElement.click();

        String imputPasteNameXpath="//*[@id=\"postform-name\"]";
        WebElement imputPasteNameElement=driver.findElement(By.xpath(imputPasteNameXpath));
        imputPasteNameElement.sendKeys("helloweb");
    }
}
