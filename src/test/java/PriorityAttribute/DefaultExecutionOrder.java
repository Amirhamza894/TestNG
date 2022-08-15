package PriorityAttribute;

import javax.swing.text.Highlighter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DefaultExecutionOrder {
	
//	WebDriver driver;
	
	@BeforeClass
	public void setUp () throws Exception
	{
			
	}
	
	@Test
	public void signIn ()
	{		
		// This will be executed second
	     // by default testNG will execute tests by alphabetical order
	}
	
	@Test
	public void searchTShirt ()
	{		
		// This will be executed first because of "Seearch", TestNG follow alphabetic order
		// by default testNG will execute tests by alphabetical order
	}
	
	@Test
	public void signOut () 
	{
		// this will be executed third
		// by default testNG will execute tests by alphabetical order
	}
	
	@AfterClass
	public void tearDown () throws Exception
	{
			
	}
}
