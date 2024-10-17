import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase {
		
		// ATTRIBUTES
		private Connection connection;
		private static DataBase db = null;
		private String url = "jdbc:postgresql://localhost/";
		private String nombreBD = "RapiditoMeals";
		private String usuario = "postgres";
		private String clave = "bismarck007";
		
		// CONSTRUCTORS
		private DataBase() {
			try {
				DriverManager.registerDriver(new org.postgresql.Driver());
				this.setConnection(DriverManager.getConnection(url + nombreBD, usuario, clave));			
				
			} catch (SQLException e) {			
				e.printStackTrace();
			}
		}	

		// METHODS
		public ResultSet query(String query) {
			ResultSet rs= null;
			try {
				rs = getConnection().createStatement().executeQuery(query);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return rs;
		}	

		public static DataBase getInstance() {
			return (db == null) ? new DataBase() : db;
		}

		public void closeConnection() {
			this.setConnection(null);
		}	
		
		// GETTER AND SETTERS
		public Connection getConnection() {
			return connection;
		}

		private void setConnection(Connection connection) {
			this.connection = connection;
		}
		
}