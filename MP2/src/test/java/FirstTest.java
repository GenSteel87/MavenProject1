import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void testS(){

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.ru/");
        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys("Selenium");
        textBox.sendKeys(Keys.ENTER);

        WebElement text = driver.findElement(By.xpath("//h3[text() = 'Selenium']"));
        Assert.assertEquals(text.getText(), "Selenium");
        driver.quit();

    }

}
