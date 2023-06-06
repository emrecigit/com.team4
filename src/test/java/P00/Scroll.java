package P00;

import org.openqa.selenium.JavascriptExecutor;

public class Scroll {
    /*

    // Scroll islemi mouse ile kaydrımaya yarar

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    // Sayfayı aşağı kaydırma
        js.executeScript("window.scrollBy(0, 500)"); // 500 piksel aşağı kaydırır
    // Sayfayı yukarı kaydırma
        js.executeScript("window.scrollBy(0, -500)"); // 500 piksel yukarı kaydırır
    // Belirli bir elementin görünür olmasını sağlamak için kaydırma
        js.executeScript("arguments[0].scrollIntoView();", user.travellerDashboardPaymentHistoryLinkElementi);
        user.travellerDashboardPaymentHistoryLinkElementi.click();




==================================================================
JavaScriptexecutor js = (JavascriptExecutor) Driver.getDriver();
js.executeScript(“window.scrollBy(0,350)”, “”);
==================================================================
JavaScriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
En alta kaydırır
===================================================================

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript(“arguments[0].scrollIntoView();”, webElement);
Web Elemente kaydırı
=================================================================
JavascriptExecutor js = (JavascriptExecutor) driver;
long intialLength = (long) js.executeScript(“return   document.body.scrollHeight”);
	       while(true){
	           js.executeScript(“window.scrollTo(0,document.body.scrollHeight)”);
	           try {
	               Thread.sleep(3000);
	           } catch (InterruptedException e) {
	               e.printStackTrace();
	           }
long currentLength = (long) js.executeScript(“return document.body.scrollHeight”);
	           if(intialLength == currentLength) {
	               break;
	           }
	           intialLength = currentLength;
	   }
	}
}
Sonsuz Kaydırma
=================================================================
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript(“window.scrollTo(0, document.body.scrollHeight)”);
	       try {
	           Thread.sleep(3000);
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }
	       js.executeScript(“window.scrollTo(document.body.scrollHeight,0)”);
	       driver.close();
}
}
     */
}
