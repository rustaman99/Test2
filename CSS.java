import  org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://eplio.com.ua/");
        WebElement input = driver.findElement(By.cssSelector("[href='https://eplio.com.ua/iphone/']"));
        input.click();

        WebElement button = driver.findElement(By.cssSelector(("[src*='13promaxiphoneiphone']")));
        button.click();
        Thread.sleep(4000);
        WebElement button1 = driver.findElement(By.cssSelector("[alt='New Apple iPhone 13 Pro Max 128Gb Gold']"));
        button1.click();
        Thread.sleep(4000);
        WebElement button2 = driver.findElement(By.cssSelector("[id='button-cart']"));
        button2.click();
        Thread.sleep(4000);
        WebElement button3 = driver.findElement(By.cssSelector("[href='https://eplio.com.ua/simplecheckout/']"));
        button3.click();
        Thread.sleep(4000);


        WebElement button4 = driver.findElement(By.cssSelector("[name*='firstname']"));
        button4.sendKeys("Arm");
        Thread.sleep(4000);
        WebElement button5 = driver.findElement(By.cssSelector("[name*='telephone']"));
        button5.sendKeys("0", Keys.ENTER);
        Thread.sleep(4000);
        driver.quit();
    }
    }

