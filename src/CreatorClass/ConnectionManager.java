package CreatorClass;


import ProductClass.Connection;

public abstract class ConnectionManager {

	Connection connection;
	public Connection getConnection()
	{		
		connection = createConnection();
		return connection;
	}
	
	
	protected abstract  Connection createConnection();
	public abstract  void display();
}
