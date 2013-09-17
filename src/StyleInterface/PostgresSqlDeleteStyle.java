/**
 * 
 */
package StyleInterface;

/**
 * @author nasit.sony
 *
 */
public class PostgresSqlDeleteStyle implements DeleteStyle{
	public void deleteFromDatabase(){
		 System.out.println("Deleting Data following PostgresSql style");
	 }
}
