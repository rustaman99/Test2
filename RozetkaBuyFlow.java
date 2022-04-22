import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RozetkaBuyFlow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allo.ua/");
        Thread.sleep(2000);
        WebElement input = driver.findElement(By.xpath("//*[@placeholder='Пошук товарів']"));
        input.sendKeys("iphone 12");
        Thread.sleep(2000);
        WebElement  button1  = driver.findElement(By.xpath("//*[@placeholder='Пошук товарів']"));
        button1.click();
       Thread.sleep(2000);
        WebElement button = driver.findElement(By.xpath("//*[@title='iphone 12']"));
        button.click();

        WebElement button2 = driver.findElement(By.xpath("//*[@title='Apple iPhone 12 128GB Black (MGJA3)']"));
          button2.click();
        Thread.sleep(2000);
        WebElement button3 = driver.findElement(By.xpath("//*[@id='product-buy-button']"));
        button3.click();
        Thread.sleep(2000);
        WebElement button4 = driver.findElement(By.xpath("//*[@data-select-store-button]"));
        button4.click();
        Thread.sleep(2000);
        WebElement button5 = driver.findElement(By.xpath("   //*[@class='order-now']"));
        button5.click();

        WebElement input1 = driver.findElement(By.xpath("//*[@id='onepage-customer-name']"));
        input1.sendKeys("Руслан");
        WebElement input2 = driver.findElement(By.xpath("//*[@placeholder='Введіть контактний номер']"));
        input2.sendKeys("05757577575");
        WebElement input3 = driver.findElement(By.xpath("//*[@placeholder='Введіть e-mail']"));
        input3.sendKeys("bosds.ruff@gmail.com");
        Thread.sleep(2000);
        WebElement button6 = driver.findElement(By.xpath("//*[@id='second-step-button']"));
        button6.click();
        Thread.sleep(6000);
        driver.quit();
    }
}
//a[text()='']
