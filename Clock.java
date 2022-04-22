import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clock {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://deka.ua/");
        WebElement input = driver.findElement(By.xpath("//*[@placeholder='Поиск']"));
        input.sendKeys("Часы");
        WebElement button = driver.findElement(By.xpath("//*[@class='header-nav__button']"));
        button.click();
        Thread.sleep(4000);
        WebElement button1 = driver.findElement(By.xpath("//*[@src='https://fs5.deka.ua/photo/goods/catalog/1/202072/GA-100-1A1ER_web.jpg']"));
        button1.click();
        Thread.sleep(4000);
        WebElement button2 = driver.findElement(By.xpath("//*[@class='button-text']"));
        button2.click();
        Thread.sleep(4000);

        WebElement button3 = driver.findElement(By.xpath("//*[@class='comparison-product__button main-button comparison-buy']"));
        button3.click();
        Thread.sleep(4000);
        WebElement input1 = driver.findElement(By.xpath("//*[@class='col-md-10 col-lg-10 col-xl-10']"));
        input1.sendKeys("Иванов");
        WebElement input2 = driver.findElement(By.xpath("//*[@class='col-md-12 col-lg-4 col-xl-4']"));
        input2.sendKeys("050777777");
    }

}
