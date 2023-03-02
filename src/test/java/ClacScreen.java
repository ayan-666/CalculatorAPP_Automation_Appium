import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.support.PageFactory.initElements;

public class ClacScreen{
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_9")
    AndroidElement btn9;
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_1")
    AndroidElement btn1;
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_2")
    AndroidElement btn2;
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_0")
    AndroidElement btn0;
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_4")
    AndroidElement btn4;
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_7")
    AndroidElement btn7;
    @FindBy(id=Setup.PACKAGE_ID+":id/digit_5")
    AndroidElement btn5;
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_8")
    AndroidElement btn8;
    @FindBy(id=Setup.PACKAGE_ID+":id/digit_3")
    AndroidElement btn3;
    @FindBy(id=Setup.PACKAGE_ID+":id/op_add")
    AndroidElement plus;
    @FindBy(id=Setup.PACKAGE_ID+":id/parens")
    AndroidElement param;
    @FindBy(id=Setup.PACKAGE_ID+":id/op_sub")
    AndroidElement minus;
    @FindBy(id=Setup.PACKAGE_ID+":id/op_mul")
    AndroidElement mul;
    @FindBy(id=Setup.PACKAGE_ID+":id/op_div")
    AndroidElement div;
    @FindBy(id = Setup.PACKAGE_ID+":id/result_preview")
    AndroidElement resultPreview;

    @FindBy(id = Setup.PACKAGE_ID+":id/eq")
    AndroidElement equals;

    @FindBy(id = Setup.PACKAGE_ID+":id/clr")
    AndroidElement clear;

    public ClacScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public String doSum() throws InterruptedException {
        Thread.sleep(2000);
        btn9.click();
        plus.click();
        btn5.click();
        String sum=resultPreview.getText();
        equals.click();
        Thread.sleep(2000);
        clear.click();
        return sum;
    }
    public String doSub() throws InterruptedException {
        Thread.sleep(2000);
        btn8.click();
        minus.click();
        btn3.click();
        String sub=resultPreview.getText();
        equals.click();
        Thread.sleep(2000);
        clear.click();
        return sub;
    }
    public String doMultiplication() throws InterruptedException {
        Thread.sleep(2000);
        btn1.click();
        btn4.click();
        mul.click();
        btn5.click();
        String mul=resultPreview.getText();
        equals.click();
        Thread.sleep(2000);
        clear.click();
        return mul;
    }
    public String doDivision() throws InterruptedException {
        Thread.sleep(2000);
        btn7.click();
        btn0.click();
        div.click();
        btn1.click();
        btn0.click();
        String div=resultPreview.getText();
        equals.click();
        Thread.sleep(2000);
        clear.click();
        return div;
    }
    public String doSeries() throws InterruptedException {
        Thread.sleep(2000);
        btn1.click();
        btn0.click();
        btn0.click();
        plus.click();
        btn2.click();
        btn0.click();
        btn0.click();
        minus.click();
        param.click();
        btn1.click();
        btn0.click();
        btn0.click();
        mul.click();
        param.click();
        btn2.click();
        div.click();
        btn5.click();
        param.click();
        param.click();
        String series=resultPreview.getText();
        equals.click();
        Thread.sleep(2000);
        clear.click();
        return series;
    }
}
