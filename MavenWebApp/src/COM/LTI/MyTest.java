package COM.LTI;

import org.junit.Test;


import static org.junit.Assert.*;

import java.sql.Connection;


public class MyTest {

	@Test
	public void myTest()
	{
		DatabaseConnector db=new DatabaseConnector();
		Connection con=db.getConnection();
	    assertNotNull(con);
	    System.out.println("success");
		
	
	}
}
