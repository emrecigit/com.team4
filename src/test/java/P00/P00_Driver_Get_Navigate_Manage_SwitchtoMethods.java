package P00;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.awt.*;
import java.time.Duration;

public class P00_Driver_Get_Navigate_Manage_SwitchtoMethods extends TestBase {
  @Test
  public void driverGetMethods() throws InterruptedException {
    driver.get("https://amazon.com");                  // url'e goturur
    Thread.sleep(2000);                           // 5 sn bekle sonra alttaki koda gec
    driver.navigate().to("https://youtube.com");// Yeni pencere acar
    System.out.println(driver.getTitle());             // Sayfa Basligini Dondurur // Amazon.com. Spend less. Smile more.
    System.out.println(driver.getCurrentUrl());        // Sayfa url'sini dondurur // https://www.amazon.com/
    System.out.println(driver.getPageSource());        //  Sayfanın kaynak kodlarini getirir
    System.out.println(driver.getWindowHandle());      // Acilan pencerenin unique hash kodunu getirir. // DF551F7EF2822B10D69DE15D492E2AB1
    System.out.println(driver.getWindowHandles());      // Acilan pencerelerin unique hash kodlarini getirir. // DF551F7EF2822B10D69DE15D492E2AB1
    driver.close();
  }

  @Test
    public void driverNavigateMethods() throws InterruptedException {
    //driver.get("https://amazon.com");
    driver.navigate().to("https://amazon.com");   // url'e goturur
    Thread.sleep(5000);                         // 5 sn bekle sonra alttaki koda gec
    driver.navigate().refresh();                      // sayfa yenileme
    driver.navigate().to("https://youtube.com");  // get methodu ile ayni
    driver.navigate().back();                         // onceki sayfa
    Thread.sleep(2000);                          // 2 sn bekle sonra alttaki koda gec
    driver.navigate().forward();                       // sonraki sayfaya gec
    Thread.sleep(2000);                          // 2 sn bekle sonra alttaki koda gec
    driver.close();
  }

  @Test
  public void driverManageMethods() throws InterruptedException {
    // 1 - driver.manage().window() Methods
     driver.get("https://youtube.com");
    // driver.navigate().to("https://youtube.com");                       // get methodu ile ayni
    Thread.sleep(5000);                                              // 5 sn bekle sonra alttaki koda gec
    driver.manage().window().fullscreen();                                // pencereyi fullscreen yapar
    driver.manage().window().setPosition(new Point(750,75));         // pencerenin pozisyonu girilir
    Thread.sleep(5000);
    System.out.println(driver.manage().window().getPosition());           // pencerenin pozisyonunu getirir (749, 74)
    driver.manage().window().setSize(new Dimension(100,500)); // pencere boyutunu ayarlar
    Thread.sleep(5000);
    System.out.println(driver.manage().window().getSize());               // pencerenin boyutunu getirir (516, 502)
//================================================================================00
    // 2 - driver.manage().timeouts() Methods
    driver.navigate().to("https://youtube.com");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// Her islem icin 5 sn bekler
    driver.close();
  }
    @Test
    public void driverswitchtoMethods() throws InterruptedException {
      driver.get("https://youtube.com");
      Thread.sleep(2000);
      //driver.switchTo().newWindow(WindowType.valueOf("https://www.amazon.com"));
      Thread.sleep(2000);
    }
}
