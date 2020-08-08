/**
 * 
 */
package com.ccopa.inmobiliariadata.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author vidcy
 *
 */
public class ConnectionFactory {
	private static Connection connection;
	
	public static Connection conectar() throws ClassNotFoundException, SQLException  {
		
			//paso 1 :cargar el driver 
			Class.forName("org.mariadb.jdbc.Driver");
			String url="jdbc:mariadb://127.0.0.1/Proyect_Inmobiliaria";
			String user="root";
			String password="77084232";
			connection =DriverManager.getConnection(url,user,password);
			return connection;		
		
	}
	

}
