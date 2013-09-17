/**
 * 
 */
package ProductClass;
import StyleInterface.*;  
/**
 * @author nasit.sony
 *
 */
public abstract class Connection {
	
	DeleteStyle deleteStyle;
	InsertStyle insertStyle;
	UpdateStyle updateStyle;
	
	
	public void performInsertion()
	{
		insertStyle.insertIntoDatabase();
		updateStyle.UpdateDatabase();
		deleteStyle.deleteFromDatabase();
	}

}
