import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalcUtilButtons {

    private  WebDriver driver;
    CalcUtilButtons(String Url){
        driver = new ChromeDriver();
        driver.get(Url);
    }
    public void MultiplyButton() {
        WebElement multiply =  driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[4]"));
        multiply.click();
    }

    public void oneButton(){
        WebElement textBox1 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[1]"));
        textBox1.click();

    }

    public void twoButton(){
        WebElement textBox2 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[2]"));
        textBox2.click();
    }

    public void threeButton(){
        WebElement textBox3 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[3]"));
        textBox3.click();
    }
    public void fourButton(){
        WebElement textBox4 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/span[1]"));
        textBox4.click();
    }
    public void fiveButton(){
        WebElement textBox5 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/span[2]"));
        textBox5.click();
    }
    public void sixButton(){
        WebElement textBox6 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/span[3]"));
        textBox6.click();
    }
    public void sevenButton(){
        WebElement textBox7 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/span[1]"));
        textBox7.click();
    }
    public void eightButton(){
        WebElement textBox8 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/span[2]"));
        textBox8.click();
    }
    public void nineButton(){
        WebElement textBox9 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/span[3]"));
        textBox9.click();
    }

    public  String printText() {
        WebElement calculateButton = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
        //calculateButton.click();
        return(calculateButton.getText());
    }

    public void zeroButton(){
        WebElement textBox0 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[4]/span[1]"));
        textBox0.click();
    }

    public void addButton() {
        WebElement AddButton = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/span[4]"));
        AddButton.click();
    }

    public void  close() {
        driver.close();
    }

}
