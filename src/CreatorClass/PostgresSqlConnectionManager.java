package CreatorClass;

import ProductClass.Connection;
import ProductClass.PostgresSqlconnection;

public class PostgresSqlConnectionManager extends ConnectionManager {
	Connection connection;
	
	
	protected  Connection createConnection(){
		connection = new PostgresSqlconnection();
		return connection;
	}
	
	public  void display()
	{
		System.out.println("Created PostgresSql Type Connection Manager");
	}
}
