/**
 * 
 */
package StyleInterface;

/**
 * @author nasit.sony
 *
 */
public class PostgresSqlInsertStyle implements InsertStyle{
	public void insertIntoDatabase(){
		System.out.println("Inserting Data following PostgresSql style");
	}
}
