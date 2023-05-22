package P00;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import utilities.TestBase;

import java.awt.*;
import java.time.Duration;

public class P00_Driver_Get_Navigate_Manage_SwitchtoMethod_WebElements_Methods extends TestBase {
  @Test
  public void driverGetMethods() throws InterruptedException {
    // ********Testte karsialstirilacak actual ifadeler herzaman ya driver.get ya webElement methodlari ile alinir*************
    driver.get("https://amazon.com");                  // url'e goturur
    Thread.sleep(2000);                           // 5 sn bekle sonra alttaki koda gec
    driver.navigate().to("https://youtube.com");// Yeni pencere acar
    System.out.println(driver.getTitle());             // Sayfa Basligini Dondurur // Amazon.com. Spend less. Smile more.
    System.out.println(driver.getCurrentUrl());        // Sayfa url'sini dondurur // https://www.amazon.com/
    System.out.println(driver.getPageSource());        //  Sayfanın kaynak kodlarini getirir
    System.out.println(driver.getWindowHandle());      // Acilan pencerenin unique hash kodunu getirir. // DF551F7EF2822B10D69DE15D492E2AB1
    System.out.println(driver.getWindowHandles());      // Acilan pencerelerin unique hash kodlarini getirir. // DF551F7EF2822B10D69DE15D492E2AB1
// **webElement.getAttribute("Id");                     // web elementin id Attribute'inin value'sini verir
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
    // driver.switchTo().newWindow() kullanarak actigimiz
    // window'a driver otomatik olarak gecer
    // ANCAKKKKK....
    // biz newWindow() method'unu kullanmadan
    // bir link tikladigimizda yeni window aciliyorsa
    // driver eski window'da kalir
    // Yeni window'a driver'i gecirebilmek icin
    // yeni window'un WindowHandleDegerine ihtiyacimiz vardir.
      driver.get("https://youtube.com");
      String youtubeWHV = driver.getWindowHandle();
      System.out.println(youtubeWHV.toString()); //6BFD97C652E0AD3A7936720BFDB35A05
      Thread.sleep(2000);
      driver.switchTo().newWindow(WindowType.TAB); // yeni sekme
      // driver.switchTo().newWindow(WindowType.WINDOW); // // yeni pencere
      driver.navigate().to("https://www.wisequarter.com");
      Thread.sleep(5000);
      String wiseWHV = driver.getWindowHandle();
      System.out.println(wiseWHV.toString()); //EFEA03691147B485E83A111B11F3FFDA
      driver.switchTo().window(youtubeWHV);
      driver.switchTo().window(wiseWHV);

      driver.quit();
    }

    @Test
    public void webElementMethods() throws InterruptedException {
    driver.get("https://amazon.com");
      WebElement aramaKutusuElementi = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
      aramaKutusuElementi.click();
      Thread.sleep(2000);
      aramaKutusuElementi.sendKeys("nutella");
      Thread.sleep(2000);
      aramaKutusuElementi.clear();
      Thread.sleep(2000);
      aramaKutusuElementi.sendKeys("Nutella"+Keys.ENTER);
      Thread.sleep(2000);
      //aramaKutusuElementi.submit(); //Enter yerine kullanilir.
      System.out.println(aramaKutusuElementi.isEnabled()); // Erisilebilir mi?
      System.out.println(aramaKutusuElementi.isDisplayed());// Gorunuyor mu
      System.out.println(aramaKutusuElementi.isSelected()); // Secili mi
      System.out.println(aramaKutusuElementi.getSize());
      System.out.println(aramaKutusuElementi.getText());
      // **webElement.getAttribute("Id");                     // web elementin id Attribute'inin value'sini verir

    }
}
