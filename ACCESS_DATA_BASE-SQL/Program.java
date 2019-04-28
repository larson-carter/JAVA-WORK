import java.sql.*;

public class Program {

	public static void main(String args[]) {

		//	YOUTUBE VIDEO I WATCHED
		
		// https://www.youtube.com/watch?v=dUDaw60nyR4
		
		
		try {

			String url = "jdbc:odbc:manuu";

			Connection c = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/VV/Desktop/Classes.mdb");

			Statement st = c.createStatement();

			ResultSet rs = st.executeQuery("select * from Classes");

			while (rs.next()) {

				for (int x = 1; x < 6; x++) {

					System.out.println(rs.getString(x));

				}

			}

		} catch (Exception ee) {

			System.out.println(ee);

		}

	}

}
