package testNg;

import org.testng.annotations.Test;

public class Dependency {
	@Test
	public void createUser(){
		System.out.println("User created successfully");
	}

	@Test(dependsOnMethods="createUser")
	public void editUser(){
		System.out.println("user edited");
	}
	
	@Test(dependsOnMethods="editUser")
	public void deleteUser(){
	System.out.println("User deleted");	
	}
	
	@Test
	public void Task(){
		System.out.println("Task completed successfully");
	}

}
