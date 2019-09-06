import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class CalculatorSeleniumTest {
    private static WebDriver  driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        // open the browser and go to open www.calculator.net'
        driver.get("https://www.calculator.net/");




        //select text box1
        WebElement textBox1 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[1]"));
        textBox1.click();
        ClickMultiplyButton multiply = new ClickMultiplyButton();
        multiply.MultiplyButton();


       // WebElement multiply1 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[4]"));
        //multiply1.click();

        WebElement textBox2 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[2]"));
        textBox2.click();

        WebElement multiply2 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[4]"));
        multiply2.click();
        // enter a value in Text box 1  ->> 10
        //textBox1.sendKeys("1");

        WebElement textBox3 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[3]"));
        textBox3.click();
///html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[3]
        WebElement multiply3 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[4]"));
        multiply3.click();


        WebElement textBox4 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/span[1]"));
        textBox4.click();
///html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[3]
        WebElement multiply4 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[4]"));
        multiply4.click();

        WebElement textBox5 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/span[2]"));
        textBox5.click();
///html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[3]
        WebElement multiply5 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[4]"));
        multiply5.click();

// /html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/span[3]
        WebElement textBox6 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/span[3]"));
        textBox6.click();
///html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[3]
        WebElement multiply6 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[4]"));
        multiply6.click();


        // driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/span[1]"))
        WebElement textBox7 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/span[1]"));
        textBox7.click();
///html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[3]
        WebElement multiply7 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[4]"));
        multiply7.click();


        WebElement textBox8 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/span[2]"));
        textBox8.click();
///html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[3]
        WebElement multiply8 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[4]"));
        multiply8.click();


        WebElement textBox9 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/span[3]"));
        textBox9.click();


///html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[3]
        //WebElement multiply9 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[4]"));
        //multiply9.click();


        // enter a value in Text box 2  ->> 50
        //WebElement textBox222 =   driver.findElement(By.xpath("//input[@id='cpar2']"));
        //textBox2.sendKeys("50");

        // Click Calculate button
        //WebElement calculateButton = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
        //calculateButton.click();


        // Read result
/*        WebElement resultElement = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[5]/span[4]"));
        String result = resultElement.getText();
        System.out.println(result);*/

        WebElement calculateButton = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
        //calculateButton.click();
        System.out.println(calculateButton.getText());

        /*// verify if the result is 5
        if(result.equals("362880")){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
       // driver.close();
 */

    }
}


