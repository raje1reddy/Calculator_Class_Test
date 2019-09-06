import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMultiplyButton {

    public void MultiplyButton() {
        //WebDriver driver = initgetdriver();
        WebElement multiply =  CalculatorSeleniumTest.getDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[4]"));
       // multiply.click();
    }

}
