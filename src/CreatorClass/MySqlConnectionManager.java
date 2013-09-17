package CreatorClass;

import ProductClass.Connection;
import ProductClass.MySqlConnection;


public class MySqlConnectionManager extends ConnectionManager{
  
	Connection connection;
	
	protected  Connection createConnection(){
		connection = new MySqlConnection();
		return connection;
	}
	public  void display()
	{
		System.out.println("Created MySQL Type Connection Manager");
	}
}
