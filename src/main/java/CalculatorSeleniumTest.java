import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalculatorSeleniumTest {
    public static void  main(String args[]){
        String baseUrl;
        // open the browser and go to open www.calculator.net'
      baseUrl = "https://www.calculator.net/";
        CalcUtilButtons multiply = new CalcUtilButtons(baseUrl);
        multiply.oneButton();
        multiply.MultiplyButton();
        multiply.twoButton();
        multiply.MultiplyButton();
        multiply.threeButton();
        multiply.MultiplyButton();
        multiply.fourButton();
        multiply.MultiplyButton();
        multiply.fiveButton();
        multiply.MultiplyButton();
        multiply.sixButton();
        multiply.MultiplyButton();
        multiply.sevenButton();
        multiply.MultiplyButton();
        multiply.eightButton();
        multiply.MultiplyButton();
        multiply.nineButton();
       String multiplication = multiply.printText();
       System.out.println("Multiplication Result for numbers 1 to 9"+ multiplication);
        multiply.close();
        CalcUtilButtons add = new CalcUtilButtons(baseUrl);
        add.zeroButton();
        add.MultiplyButton();
        add.zeroButton();
        add.addButton();
        add.oneButton();
        add.addButton();
        add.twoButton();
        add.addButton();
        add.threeButton();
        add.addButton();
        add.fourButton();
        add.addButton();
        add.fiveButton();
        add.addButton();
        add.sixButton();
        add.addButton();
        add.sevenButton();
        add.addButton();
        add.eightButton();
        add.addButton();
        add.nineButton();
        String addition = add.printText();
        System.out.println("Addition Result for numbers 0 to 9 "+ addition);
        add.close();
    }
}


