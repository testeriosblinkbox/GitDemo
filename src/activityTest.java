import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class activityTest extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("The current activity is:---"+driver.currentActivity());
		System.out.println("The context is:---"+driver.getContext());
		System.out.println("the orientation is:---"+driver.getOrientation());
		System.out.println("the device lock is:---"+driver.isDeviceLocked());
		//driver.hideKeyboard();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.navigate().back();
	}

}
