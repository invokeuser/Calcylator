import org.openqa.selenium.By;

public class DemoPage {

	
	By email= By.id("emailid");	 
	By name= By.id("name");	 
	By id= By.id("pass");	 
	
	public void init()
	{
		System.out.println("initizling the driver");
	}
}
