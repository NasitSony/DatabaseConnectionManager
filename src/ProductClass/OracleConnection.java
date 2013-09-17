/**
 * 
 */
package ProductClass;

import StyleInterface.*;


/**
 * @author nasit.sony
 *
 */
public class OracleConnection extends Connection{
		
	public OracleConnection(){
		deleteStyle = new OracleDeleteStyle();
		insertStyle = new OracleInsertStyle();
		updateStyle = new OracleUpdateStyle();
	}
}
