package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.codec.digest.DigestUtils;

public class UsuarioModel {
	
	private String nombre;
	private String apellido;
	
	/*
		String texto = "admin";
		String encriptMD5=DigestUtils.md5Hex(texto);
		System.out.println(encriptMD5);
	 */
	
	public Boolean login(String usuario, String pass) {
		DataBase conexion = DataBase.getInstance();
		String query = "SELECT * FROM usuario WHERE usuario = '"+usuario+"' AND password = '"+DigestUtils.md5Hex(pass)+"'";
		ResultSet result = conexion.query(query);
		try {
			if (result.next()) {
				this.nombre = result.getString(2);
				this.apellido = result.getString(3);
				return true;
			}else return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public ArrayList<Object []> allUsuarios() {
		DataBase conexion = DataBase.getInstance();
		ArrayList<Object []> array  = new ArrayList<Object[]>();
		String query = "SELECT * FROM usuario";
		ResultSet result = conexion.query(query);
		try {
			while(result.next()) {
				Object []  row = {result.getString(2), result.getString(3),result.getString(5)};
				array.add(row);
			}
			return array;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return array;
	}
	

}
