/**
 * 
 */
package ProductClass;
import StyleInterface.*;
/**
 * @author nasit.sony
 *
 */
public class PostgresSqlconnection extends Connection{
	
	public PostgresSqlconnection()
	{
		deleteStyle = new PostgresSqlDeleteStyle();
		insertStyle = new PostgresSqlInsertStyle();
		updateStyle = new PostgresSqlUpdateStyle();
	}

}
