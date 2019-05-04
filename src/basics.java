import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//tagname[@attribute='value']
		//android.widget.TextView[@text='Preference']
		
		String prefText = driver.findElementByAndroidUIAutomator("text(\"Preference\")").getText();
		System.out.println("the prefText is:---"+prefText);
		
		String osText = driver.findElementByXPath("//android.widget.TextView[@text='OS']").getText();
		System.out.println("the osText is:---"+osText);
		
		String viewText = driver.findElementByXPath("//android.widget.TextView[@text='Views']").getText();
		System.out.println("the viewText is:---"+viewText);
		
		List<AndroidElement> listofItems=driver.findElements(By.className("android.widget.TextView"));
		
		 System.out.println("the total listofItems are:---"+listofItems.size());
		 
		  for (int i=0; i <listofItems.size(); i++ )
		  {
			  System.out.println("the total listofItems are:---"+listofItems.get(i).getText());
		  }
		
	}

}
