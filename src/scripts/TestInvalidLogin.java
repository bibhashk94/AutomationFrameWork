package scripts;



import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPages;

public class TestInvalidLogin extends BaseTest {
	@Test
	public void testInvalidLogin(){
		
		LoginPages l = new LoginPages(driver);
		int rowCount =Lib.getRowCount(EXCEL_PATH, "InvalidLogin");
		for(int i=1; i<rowCount;i++){
		String username =	Lib.getCellValue(EXCEL_PATH, "InvalidLogin", i, 0);
		String password = Lib.getCellValue(EXCEL_PATH, "InvalidLogin", i, 1);
		l.setUsername(username);
		l.setPassword(password);
		l.clickLogin();
		}
		
	}

}
