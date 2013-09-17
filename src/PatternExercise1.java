/**
 * 
 */

/**
 * @author nasit.sony
 *
 */
/*import java.io.File;
import java.io.FileReader;
import java.io.IOException;*/
import java.io.*;
import CreatorClass.*;
import ProductClass.*;

public class PatternExercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "c:\\input.txt"	;	
		String type = readFile(fileName);		
		ConnectionManager connectionManager =  getConnectionManager(type);
		
		
		
		connectionManager.display();
		Connection connection = connectionManager.getConnection();
		connection.performInsertion();
		
	}
	
	public static String readFile(String fileName)
	{
		
		
		   String content = null;
		   File file = new File(fileName); 
		   try {
		       FileReader reader = new FileReader(file);
		       char[] chars = new char[(int) file.length()];
		       reader.read(chars);
		       content = new String(chars);
		       reader.close();
		   } catch (IOException e) {
		       e.printStackTrace();
		   }
		   return content;
		
		
	}
	
	public static ConnectionManager getConnectionManager(String type)
	{
		ConnectionManager connectionManager ;
		if(type.equals("MySql"))
		{
			connectionManager = new MySqlConnectionManager();
		}
		else if(type.equals("Oracle"))
		{
		    connectionManager = new OracleConnectionManager();
		}
		else if(type.equals("PostgresSql"))
		{
		    connectionManager = new PostgresSqlConnectionManager();
		}else 
			connectionManager = null;
		
		return connectionManager;
	}

}
