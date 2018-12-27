package testNg;

import org.testng.annotations.Test;

public class ActiTime {
	@Test(priority = 1)
	public void createUser(){
		System.out.println("User created successfully");
	}

	@Test(priority =2)
	public void editUser(){
		System.out.println("user edited");
	}
	
	@Test(priority = 3)
	public void deleteUser(){
	System.out.println("User deleted");	
	}
	
	@Test(invocationCount = 3, priority=4)
	public void Task(){
		System.out.println("Task completed successfully");
	}
}
