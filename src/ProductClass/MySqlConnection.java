package ProductClass;
import StyleInterface.*; 

public class MySqlConnection extends Connection{
	
	public MySqlConnection()
	{
		deleteStyle = new MySqlDeleteStyle();
		insertStyle = new MySqlInsertStyle();
		updateStyle = new MySqlUpdateStyle();
	}

}
