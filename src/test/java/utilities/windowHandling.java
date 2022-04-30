package utilities;

import java.util.Set;
import base.BaseClass;

public class windowHandling extends BaseClass{
	public String actualTitle="";
	public String outValue="";
	public void handleWindows() throws InterruptedException
	{
		String activeHandle=driver.getWindowHandle();
		
		Set<String> handles=driver.getWindowHandles();
		for(String  handle: handles)
		{
			
			if(activeHandle.equals(handle))
			{
				
				//System.out.println("this is active window:"+activeHandle);
				//System.out.println("this is active window now in if condition"+driver.switchTo().window(handle).getTitle());
				
			}
			else
			{
				//System.out.println("this is active window:"+handle);
				outValue=handle;
				//System.out.println("this is active window now in else condition"+driver.switchTo().window(handle).getTitle());
				actualTitle=driver.switchTo().window(handle).getTitle();
				
			}
		}
		
		
		
	}
	

}
