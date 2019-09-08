import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalculatorSeleniumTest {
    public static WebDriver  driver;
   // public static WebDriver getDriver() {
      //  return driver;
    //}
    public static void  main(String args[]){
        String baseUrl;

        WebDriver driver = new ChromeDriver();
        // open the browser and go to open www.calculator.net'
       baseUrl = "https://www.calculator.net/";
               //driver.get("https://www.calculator.net/");
        driver.get(baseUrl);
        //select text box1
        CalcUtilButtons util = new CalcUtilButtons(baseUrl);
        util.oneButton();
        util.MultiplyButton();
        util.twoButton();
        util.MultiplyButton();
        util.threeButton();
        util.MultiplyButton();
        util.fourButton();
        util.MultiplyButton();
        util.fiveButton();
        util.MultiplyButton();
        util.sixButton();
        util.MultiplyButton();
        util.sevenButton();
        util.MultiplyButton();
        util.eightButton();
        util.MultiplyButton();
        util.nineButton();
       String multiplication = util.printText();
       System.out.println("Multiplication Result"+ multiplication);
       
        util.zeroButton();
        util.MultiplyButton();
        util.zeroButton();
        util.addButton();
        util.oneButton();
        util.addButton();
        util.twoButton();
        util.addButton();
        util.threeButton();
        util.addButton();
        util.fourButton();
        util.addButton();
        util.fiveButton();
        util.addButton();
        util.sixButton();
        util.addButton();
        util.sevenButton();
        util.addButton();
        util.eightButton();
        util.addButton();
        util.nineButton();
        String addition = util.printText();
        System.out.println("Addition Result"+ addition);
        driver.close();
    }
}


