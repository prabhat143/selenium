package testNg;

import org.testng.annotations.DataProvider;

public class DataDrivendemo {
	
	@DataProvider
	public Object[][] getData(){
		Object[][] credentials=new Object[1][2];
		credentials[0][0]="gaddamprabhat";
		credentials[0][1]="1947@India";
		return credentials;
	}

}
