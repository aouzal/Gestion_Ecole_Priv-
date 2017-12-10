package gestion;
import java.sql.*;
public class connectDB {
	private Connection con;
	private PreparedStatement st;
	private ResultSet rs;
	
	
	
	public connectDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
			System.out.println("done");
			//st=con.createStatement();
		}catch(Exception e) {
			
			System.out.println("error"+ e);
		}
		
		
	}

}
