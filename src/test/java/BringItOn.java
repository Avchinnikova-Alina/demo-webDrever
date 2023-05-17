import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BringItOn {
    @Test
    public void HelloWeb() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com/");
        String inputNewPasteXpath="//*[@id=\"postform-text\"]";
        WebElement inputNewPasteElement=driver.findElement(By.xpath(inputNewPasteXpath));
        inputNewPasteElement.sendKeys("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");

        String inputSyntaxXpath="//*[@id=\"w0\"]/div[2]/div/div/div/label";
        WebElement inputSyntaxElement=driver.findElement(By.xpath(inputSyntaxXpath));
        inputSyntaxElement.click();

        String submitHighlightingXpath="//*[@id=\"w0\"]/div[5]/div[1]/div[3]/div/span/span[1]/span";
        WebElement submitHighlightingElement=driver.findElement(By.xpath(submitHighlightingXpath));
        submitHighlightingElement.click();

        String submitBashXpath="//*[contains(@id,'select2-postform-format-result-') and contains(@id, '-8')]";
        WebElement submitBashElement=driver.findElement(By.xpath(submitBashXpath));
        submitBashElement.click();

        String submitPasteExpirationXpath="//*[@id=\"w0\"]/div[5]/div[1]/div[4]/div/span/span[1]/span/span[2]";
        WebElement submitPasteExpirationElement=driver.findElement(By.xpath(submitPasteExpirationXpath));
        submitPasteExpirationElement.click();

        String submitTenMinXpath="//*[contains(@id,'select2-postform-expiration-result-') and contains(@id, '-10M')]";
        WebElement submitTenMinElement=driver.findElement(By.xpath(submitTenMinXpath));
        submitTenMinElement.click();

        String inputPasteNameXpath="//*[@id=\"postform-name\"]";
        WebElement inputPasteNameElement=driver.findElement(By.xpath(inputPasteNameXpath));
        inputPasteNameElement.sendKeys("how to gain dominance among developers");

        String submitCreatePasteXpath="//*[@id=\"w0\"]/div[5]/div[1]/div[10]/button";
        WebElement submitCreatePasteElement=driver.findElement(By.xpath(submitCreatePasteXpath));
        submitCreatePasteElement.click();
    }
}
