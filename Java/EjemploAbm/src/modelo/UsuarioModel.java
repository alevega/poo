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
		UsuarioDao usdao = new UsuarioDao();
		return usdao.login(usuario, pass);
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
	
	public Boolean agregarUsuario(String nombre, String apellido, String usuario, String pass) {
		UsuarioDao usdao = new UsuarioDao();
		return usdao.agregar(nombre, apellido, usuario, pass);
	}
	

}
