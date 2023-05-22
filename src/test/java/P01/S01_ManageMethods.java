package P01;

import org.junit.Test;
import org.openqa.selenium.Point;
import utilities.TestBase;

public class S01_ManageMethods extends TestBase {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.amazon.com");
        driver.manage().window().setPosition(new Point(500,50));

        Thread.sleep(5000);
    }
    @Test
    public void youtubeTesti(){
        System.out.println("Youtube");
    }
    @Test
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }
    @Test
    public void amazonTesti(){ // priority yazilmazsa 0 degeri alir
        System.out.println("Amazon");
    }
}





