package testNg;

import org.testng.annotations.Test;

public class GroupDemo {
	@Test(groups={"smoke"})
	public void createUser(){
		System.out.println("User created successfully");
	}

	@Test(groups={"user","regression"})
	public void editUser(){
		System.out.println("user edited");
	}
	
	@Test(groups={"user","regression"})
	public void deleteUser(){
	System.out.println("User deleted");	
	}
	
	@Test(groups={"smoke"})
	public void createTask(){
		System.out.println("Task created completed successfully");
	}
	
	@Test(groups={"smoke"})
	public void LogTime(){
		System.out.println("logging time sheet completed");
	}
	
	@Test(groups={"task","regression"})
	public void editTask(){
		System.out.println("Task edited successfully");
	}
	
	@Test(groups={"task","regression"})
	public void deleteTask(){
		System.out.println("Task deleted sucessfully");
	}

}
