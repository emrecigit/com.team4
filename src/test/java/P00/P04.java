package P00;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class P04 extends TestBase {
 //   Bir test class’i olusturun ilgili ayarlari yapin
 //   https://www.automationexercise.com/ adresine gidin
 //   Sayfada 147 adet link bulundugunu test edin.
 //   Products linkine tiklayin
 //   special offer yazisinin gorundugunu test edin
 //   Sayfayi kapatin

    @Test
    public void test01() {
        driver.get("https://www.automationexercise.com/");

        List<WebElement> linkElement = driver.findElements(By.tagName("a"));
        int expectedElementSayisi =147;
        int actualElementSayisi = linkElement.size();
        System.out.println(linkElement.size());
        Assert.assertEquals(expectedElementSayisi, actualElementSayisi);

    }


}
