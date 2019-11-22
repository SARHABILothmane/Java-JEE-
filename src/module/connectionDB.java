package module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDB {
public static Connection con=null;
	
	public static Connection  getconnection() {
		String url = "jdbc:mysql://localhost:3306/comptebanquaire?useSSL=false";
		String user = "root";
		String password = "";
		if(con!=null) return con;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("DRIVER OK");
		
			con = DriverManager.getConnection(url, user , password);
			System.out.println("data base connecte");
		}	
			catch (SQLException e) {
				e.printStackTrace();
			}
            catch (ClassNotFoundException e) {
            	e.printStackTrace();
			}
		
		return con;
		
	}
	public static void disconnect() {
		if(con==null) return;
		try{
			con.close();
			con=null;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
