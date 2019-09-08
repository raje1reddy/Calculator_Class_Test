import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalculatorSeleniumTest {
    public static void  main(String args[]){
        String baseUrl;
        // open the browser and go to open www.calculator.net'
      baseUrl = "https://www.calculator.net/";
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
        util.close();
        CalcUtilButtons utils = new CalcUtilButtons(baseUrl);
        utils.zeroButton();
        utils.MultiplyButton();
        utils.zeroButton();
        utils.addButton();
        utils.oneButton();
        utils.addButton();
        utils.twoButton();
        utils.addButton();
        utils.threeButton();
        utils.addButton();
        utils.fourButton();
        utils.addButton();
        utils.fiveButton();
        utils.addButton();
        utils.sixButton();
        utils.addButton();
        utils.sevenButton();
        utils.addButton();
        utils.eightButton();
        utils.addButton();
        utils.nineButton();
        String addition = utils.printText();
        System.out.println("Addition Result"+ addition);
        utils.close();
    }
}


