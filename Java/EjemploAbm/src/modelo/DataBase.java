package modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DataBase {
		
		private Connection connection;
		private static DataBase db = null;
		
		
		private DataBase() {
			var props = new Properties();
			var envFile = Paths.get("src\\Config.env");
			try(var inputStream = Files.newInputStream(envFile)){
				props.load(inputStream);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			try {
				DriverManager.registerDriver(new org.postgresql.Driver());
				String url = props.get("host").toString()+props.get("base").toString();
				this.setConnection(DriverManager.getConnection(url, props.get("usuario").toString(), props.get("pass").toString()));			
				
			} catch (SQLException e) {			
				e.printStackTrace();
			}
		}	

		
		public ResultSet query(String query) {
			ResultSet rs= null;
			try {
				rs = getConnection().createStatement().executeQuery(query);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return rs;
		}	
		
		public Boolean insert(String query) {
			try {
				Statement statement = getConnection().createStatement();
				//executeUpdate es para realizar insert, update o delete, esto devuelve 1 
				int res1 =statement.executeUpdate(query);
				if(res1 == 1) {
					return true;
				}
				return false;
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}	

		public static DataBase getInstance() {
			return (db == null) ? new DataBase() : db;
		}

		public void closeConnection() {
			this.setConnection(null);
		}	
		
		public Connection getConnection() {
			return connection;
		}

		private void setConnection(Connection connection) {
			this.connection = connection;
		}
		
}