package CreatorClass;

import ProductClass.Connection;
import ProductClass.OracleConnection;

public class OracleConnectionManager extends ConnectionManager{
	Connection connection;
	
	protected  Connection createConnection(){
		return connection = new OracleConnection();
	}
	
	public  void display()
	{
		System.out.println("Created Oracle Type Connection Manager");
	}
}
