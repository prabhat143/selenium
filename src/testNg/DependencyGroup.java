package testNg;

import org.testng.annotations.Test;

public class DependencyGroup {
	
	@Test(groups={"user"})
	public void createUser(){
		System.out.println("User created successfully");
	}

	
	
	@Test(groups={"tasks"},dependsOnGroups = "user")
	public void LogTime(){
		System.out.println("logging time sheet completed");
	}
	
	


}
