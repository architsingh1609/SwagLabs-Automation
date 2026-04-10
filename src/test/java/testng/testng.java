package testng;

import org.testng.annotations.Test;

/*
 1 open website 
 2 Login website 
 3 Logout website 
 * 
 */
public class testng {
	@Test(priority = 1)
	public void open() {
		System.out.println("Openeing the site ");
	}
	@Test(priority = 2)
	public void Loginweb() {
		System.out.println("Loginweb the site ");
	}
	@Test(priority = 3)
	public void Logoutweb() {
		System.out.println("Logoutweb the site ");
	}
	

}
