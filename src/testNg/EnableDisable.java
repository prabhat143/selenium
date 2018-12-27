package testNg;

import org.testng.annotations.Test;

public class EnableDisable {

	@Test(enabled = true)
	public void createUser(){
		System.out.println("User created successfully");
	}

	@Test(enabled = true)
	public void editUser(){
		System.out.println("user edited");
	}
	
	@Test(enabled = false)
	public void deleteUser(){
	System.out.println("User deleted");	
	}
}
