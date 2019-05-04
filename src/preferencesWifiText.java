import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class preferencesWifiText extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub{

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Preference\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"3. Preference dependencies\")").click();
		
		driver.findElementById("android:id/checkbox").click();
		
		//driver.findElementById("android:id/title").click();
		driver.findElementByAndroidUIAutomator("text(\"WiFi settings\")").click();
		
		driver.findElementById("android:id/edit").sendKeys("By Rahul Shetty");
		
		driver.findElementById("android:id/button1").click();
		
	}
}
