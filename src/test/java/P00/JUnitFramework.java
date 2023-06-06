package P00;

public class JUnitFramework {
/*
Main dosyası içine resources dosyası (Directory)
resources içine (Junit oncesi; Selenium için chromedriver_win32 ve
                 selenium-java-4.9.0 jar dosya klasörü eklenir)
pom.xml icine dependencies 'lar eklenir (Kutuphane)

JUnit Annotations
@Test , @BeforeClass Basta Birkere calisir , @AfterClass Sonda Birkere calisir,
@Before Her Test oncesi calisir,@After Her Test sonrası calisir ,@Ignore Testi atlar

JUnit Assertions

Random random = new Random();
int min =6 ; //alt sınır
int max =13; // ust sınır
int randomNumber = random.nextInt(max-min+1)+min;  // max-min+1 sayı aralığını 0-8 sayısı arasını +min ise sayının alt sınırdan başlamasını sağlar 6 ile 13 arası
String DinamikLocate = "(/*[@class='locate'])["+randomNumber+"]";
WebElement =dinamikLocateElementi = Driver.getDriver.findElement(By.xpath("randomNumber"));
Assert.assertTrue(dinamikLocateElementi.isEnabled());

 */
}
