import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions; 
import static io.appium.java_client.touch.offset.ElementOption.element; 
import io.appium.java_client.TouchAction;

public class longPressPopupTest extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		
		WebElement peopleNames = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		
		
         TouchAction action = new TouchAction(driver).longPress(LongPressOptions.longPressOptions().withElement(element(peopleNames))
		                                             .withDuration(Duration.ofMillis(10000))).release().perform();
         Thread.sleep(5000);
         System.out.println("The display value is:---"+driver.findElementById("android:id/title").isDisplayed());
		
		
	}

}
