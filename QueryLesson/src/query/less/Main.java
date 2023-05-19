package query.less;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DbConnection db = new DbConnection();
			Person a = new Person("ciao","ciao","hola","boh");
			db.readPerson("ciao");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
