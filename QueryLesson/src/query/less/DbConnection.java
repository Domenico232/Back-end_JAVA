package query.less;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection {
	String url = "jdbc:postgresql://localhost:5432/";
	String dbName = "dbtest-fs0123";
	String user = "postgres";
	String pass = "admin";
	Connection conn;
	Statement st;
	
	public DbConnection() throws SQLException {
		conn = DriverManager.getConnection(url+dbName,user,pass);
		st = conn.createStatement();
		
	
	}
	
	public void doTable() throws SQLException {
						// INSERT INTO Tabella per aggiungere persona
		String sql = "CREATE TABLE Persons (LastName varchar(255),FirstName varchar(255),Address varchar(255),City varchar(255));";
		st.executeUpdate(sql);
	}
	public void createPerson(Person persona) throws SQLException {
		// INSERT INTO Tabella per aggiungere persona
		String sql = "INSERT INTO Persons (LastName,FirstName,Address,City)"
				+ "VALUES ('"+persona.LastName+"', '"+persona.FirstName+"', '"+persona.Address+"', '"+persona.City+"');";
		st.executeUpdate(sql);
		}
	
	public Person readPerson(int id) throws SQLException {
		String sql = "SELECT * FROM Persons WHERE persons.LastName=" + id;
		ResultSet rs = st.executeQuery(sql);
		Person c = null;
		if (rs.next()) {
			int num = rs.getInt("numPersona");
			String lastname = rs.getString("lastname");
			String firstName = rs.getString("firstname");
			String address = rs.getString("address");
			String city = rs.getString("city");
			c = new Person(lastname,firstName,address,city);
		}
		return c;
	}

	public void readPerson(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}
