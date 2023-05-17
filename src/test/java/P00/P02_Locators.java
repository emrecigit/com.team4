package P00;

public class P02_Locators {
     /* Locators olarak ; //driver.findElement(By.id())
        Locate Unique olmalidir.
        Her HTML (isaretleme dili) ogesi 3 unsuran olusur
        1- tag (Etiket) : bir HTML ogesinin baslangic ve sonunu belirler. <x y> arasi veya <xxx>  </xxx> baslangic ve sonu iki sekilde de olabilir
        2- attribute : tag icinde yeralan = oncesi hersey key=value seklinde value ile birlikte kullanilir
        3- attribute value : tag icinde yeralan = sonrası "" arasindaki hersey

        İlk Aranacak olan Attributes id 'dir ancak id degisken olabilmekte en fazla kullanacagimiz xpath'dir.

        1-By id, (id degisebilir ancak ilk aranması gereken)
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        2-By name,
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));

        3-By classname,(Genelde unique olmaz ve ayni ozellikte pekcok we vardir ve bosluk varsa saglikli calismayabilir)
        WebElement aramaKutusu = driver.findElement(By.classname("nav-input nav-progressive-attribute"));

        4-By tagName, unique bulmaz genelde a tag'i ile Link (text) sayisi bulmak icin
        //input ornegin cok sayida vardir.

        5-By linkText, <a tag'i ile veya attribute key'i : href ve genelde link text bulunur >link text</a>
        WebElement aramaKutusu = driver.findElement(By.linkText("addresses"));

        6-By partiallink,(=Linkin bir kısmı) <a tag'i ile veya attribute key : href ve genelde link text bulunur >link text</a>
        WebElement aramaKutusu = driver.findElement(By.partiallinkText("esses"));

        7-By xpath, %90    // ilk 6 ile bulunamadiysa kullanilir
        Format;
        (//tagname[@attributeKey='attributeValue'])[x] ; x=kacinci webelement
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@type='text']"));

        8-By cssSelector   // ilk 6 ile bulunamadiysa kullanilir attribute id veya class ise pratik olarak yazilabilir
        Format;
        (tagname[attributeKey='attributeValue'])[x] ; x=kacinci webelement
        WebElement aramaKutusu = driver.findElement(By.cssSelector("#twotabsearchtextbox']")); ==>id
        WebElement aramaKutusu = driver.findElement(By.cssSelector(".nav-input nav-progressive-attribute']")); ==>class
      */
}
