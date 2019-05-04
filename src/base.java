import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
        AndroidDriver<AndroidElement> driver;
        
		File appDir = new File("/Users/test/Desktop/apks/");
	    //File app = new File(appDir, "ContactManager.apk");
		File app = new File(appDir, "ApiDemos-debug.apk");
	    
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S6");    //0715f7a090323f36	  device
		caps.setCapability("device","Android");
		caps.setCapability("platformName","Android");
		
        caps.setCapability("app", app.getAbsolutePath());
	    driver =  new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	    return driver;
	}

}
