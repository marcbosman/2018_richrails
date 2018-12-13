package src.Persistency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/richrails?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "java";
		String password = "1qaz2wsx";

		System.out.println("Connecting database...");

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
		    System.out.println("Database connected!");
		    
		    String query = "SELECT * FROM train";

		      // create the java statement
		      Statement st = connection.createStatement();
		      
		      // execute the query, and get a java resultset
		      ResultSet rs = st.executeQuery(query);
		      
		      // iterate through the java resultset
		      while (rs.next())
		      {
		        int id = rs.getInt("trainId");
		        String wagon = rs.getString("wagon");
		        
		        // print the results
		        System.out.format("%s, %s\n", id, wagon);
		      }
		      st.close();
		      connection.close();
		    
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
	}
}