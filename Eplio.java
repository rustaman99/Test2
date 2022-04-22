import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eplio {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.get("https://eplio.com.ua/");
        WebElement ca = driver.findElement(By.xpath("//*[@data-href='#mnavc59']"));
        ca.click();
        Thread.sleep(4000);
        WebElement in = driver.findElement(By.xpath("//*[@src='https://eplio.com.ua/image/cache/webp/catalog/Apple%20new/13iphoneiphone-365x299.webp']"));
        in.click();
        Thread.sleep(4000);
        WebElement button = driver.findElement(By.xpath("//*[@src='https://eplio.com.ua/image/cache/webp/catalog/product_3635_0_image-380x380.webp']"));
        button.click();
        Thread.sleep(4000);
        WebElement button1 = driver.findElement(By.xpath("//*[@class='btn products-full-list__btn js-btn-add-cart']"));
        button1.click();
        Thread.sleep(4000);

        WebElement button2 = driver.findElement(By.xpath("//*[@href='https://eplio.com.ua/simplecheckout/']"));
        button2.click();
        Thread.sleep(4000);
        WebElement input = driver.findElement(By.xpath("//*[@id='customer_firstname']"));
        input.sendKeys("Arm");
        Thread.sleep(4000);
        WebElement input1 = driver.findElement(By.xpath("//*[@id='customer_telephone']"));
        input1.sendKeys("99678877");
        Thread.sleep(4000);
        driver.quit();

    }
}
