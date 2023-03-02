import javafx.scene.layout.Priority;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestRunner extends Setup{
    @Test(priority = 1,description = "Sum of 7 and 8")
    public void doSum() throws InterruptedException {
        ClacScreen calcscreen=new ClacScreen(driver);
        String sum= calcscreen.doSum();
        System.out.println(sum);
        Assert.assertEquals(sum,"14");
    }
    @Test(priority = 2,description = "Sub of 8 and 7")
    public void doSub() throws InterruptedException {
        ClacScreen calcscreen=new ClacScreen(driver);
        String sub= calcscreen.doSub();
        System.out.println(sub);
        Assert.assertEquals(sub,"5");
    }
    @Test(priority = 3,description = "Multiplication of 14 and 5")
    public void doMultiplication() throws InterruptedException {
        ClacScreen calcscreen=new ClacScreen(driver);
        String mul= calcscreen.doMultiplication();
        System.out.println(mul);
        Assert.assertEquals(mul,"70");
    }

    @Test(priority = 4,description = "Division of 70/10")
    public void doDivision() throws InterruptedException {
        ClacScreen calcscreen=new ClacScreen(driver);
        String div= calcscreen.doDivision();
        System.out.println(div);
        Assert.assertEquals(div,"7");
    }
    @Test(priority = 5,description = "Series Solve")
    public void doSeries() throws InterruptedException {
        ClacScreen calcscreen=new ClacScreen(driver);
        String series= calcscreen.doSeries();
        System.out.println(series);
        Assert.assertEquals(series,"260");
    }
}
