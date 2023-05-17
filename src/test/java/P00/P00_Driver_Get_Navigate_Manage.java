package P00;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import utilities.TestBase;

public class P00_Driver_Get_Navigate_Manage extends TestBase {
  @Test
    public void driverNavigateMethods() throws InterruptedException {
    driver.get("https://amazon.com");
    Thread.sleep(5000);                         // 5 sn bekle sonra alttaki koda gec
    driver.navigate().refresh();                      // sayfa yenileme
    driver.navigate().to("https://youtube.com");  // get methodu ile ayni
    driver.navigate().back();                         // onceki sayfa
    Thread.sleep(2000);                          // 2 sn bekle sonra alttaki koda gec
    driver.navigate().forward();                       // sonraki sayfaya gec
    Thread.sleep(2000);                          // 2 sn bekle sonra alttaki koda gec
  }

  @Test
  public void driverManageMethods() throws InterruptedException {
    driver.navigate().to("https://youtube.com");                       // get methodu ile ayni
    Thread.sleep(5000);                                              // 5 sn bekle sonra alttaki koda gec
    driver.manage().window().fullscreen();                                // pencereyi fullscreen yapar
    driver.manage().window().setPosition(new Point(750,75));         // pencerenin pozisyonu girilir
    Thread.sleep(5000);
    System.out.println(driver.manage().window().getPosition());           // pencerenin pozisyonunu getirir (749, 74)
    driver.manage().window().setSize(new Dimension(100,500)); // pencere boyutunu ayarlar
    Thread.sleep(5000);
    System.out.println(driver.manage().window().getSize());               // pencerenin boyutunu getirir (516, 502)


  }
}
