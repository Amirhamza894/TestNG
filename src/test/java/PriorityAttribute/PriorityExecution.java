package PriorityAttribute;

import javax.swing.text.Highlighter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PriorityExecution {

	
	@BeforeClass
	public void setUp () throws Exception
	{
			
	}
	
	@Test (priority = 1)
	public void signIn ()
	{		
	     // Now this will be executed first
	}
	
	@Test (priority = 2)
	public void searchTShirt ()
	{		
		// Now this will be executed second
	}
	
	@Test (priority = 3)
	public void signOut () 
	{
		// Now this will be executed third
	}
	
	@AfterClass
	public void tearDown () throws Exception
	{
				
	}
}
