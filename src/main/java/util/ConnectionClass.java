package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {

	static String databaseURL = "jdbc:mysql://localhost:3306/learning";
	static String databaseUserName = "root";
	static String databasePassword = "G@$3";
	private ConnectionClass(){}
	public static Connection connectionClass;
	public static Connection getConnection() {
		if(connectionClass == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connectionClass = DriverManager.getConnection(databaseURL, databaseUserName, databasePassword);
				return connectionClass;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return connectionClass;
	}
}
