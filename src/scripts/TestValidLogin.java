package scripts;



import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPages;

public class TestValidLogin extends BaseTest{
	@Test
	public void testValidLogin(){
		//enter username 
		LoginPages l= new LoginPages(driver);
		String username= Lib.getCellValue(EXCEL_PATH, "Sheet1",1,0);
		l.setUsername(username);
		
		//enter password
		String password= Lib.getCellValue(EXCEL_PATH, "Sheet1",1,1);
		l.setPassword(password);
		
		//click on login button
		l.clickLogin();
	}

}
