import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormTest {

    public static void main(String[] args) {

        System.setProperty(
            "webdriver.chrome.driver",
            System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe"
        );

        WebDriver driver = new ChromeDriver();

        try {
            File file = new File("form/index.html");
            String url = "file:///" + file.getAbsolutePath().replace("\\", "/");

            driver.get(url);

            driver.findElement(By.id("name")).sendKeys("Arya");
            driver.findElement(By.id("email")).sendKeys("test@gmail.com");
            driver.findElement(By.id("mobile")).sendKeys("9876543210");
            driver.findElement(By.id("dept")).sendKeys("Computer");
            driver.findElement(By.xpath("//input[@value='Female']")).click();

            driver.findElement(By.id("comments"))
                  .sendKeys("This is a very good feedback form created for testing purpose only");

            driver.findElement(By.xpath("//input[@value='Submit']")).click();

            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}