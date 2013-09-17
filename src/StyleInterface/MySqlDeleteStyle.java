/**
 * 
 */
package StyleInterface;

/**
 * @author nasit.sony
 *
 */
public class MySqlDeleteStyle implements DeleteStyle{
	 public void deleteFromDatabase(){
		 System.out.println("Deleting Data following MySQL style");
	 }
}
