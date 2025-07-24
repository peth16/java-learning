package practice_selenium;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleAlertPopup {

    @Test
    public void alertHandling() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","E:\\learning Java & Practicing\\chromedriver.exe");
        WebDriver driver;

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://demo.automationtesting.in/Alerts.html");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click();

        Alert al = driver.switchTo().alert();
        al.accept();    /** When only OK button in the Alert Box */

        driver.findElement(By.xpath("//a[normalize-space()=\"Alert with OK & Cancel\"]")).click();

        driver.findElement(By.xpath("//button[normalize-space()=\"click the button to display a confirm box\"]")).click();
        System.out.println(driver.switchTo().alert().getText());
        al.accept();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[normalize-space()=\"click the button to display a confirm box\"]")).click();
        al.dismiss();

        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);

        driver.quit();

    }

}
