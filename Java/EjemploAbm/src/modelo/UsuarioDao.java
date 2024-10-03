package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.codec.digest.DigestUtils;

public class UsuarioDao {
	
	
	
	public Boolean login(String usuario, String pass) {
		DataBase conexion = DataBase.getInstance();
		String query = "SELECT * FROM usuario WHERE usuario = '"+usuario+"' AND password = '"+DigestUtils.md5Hex(pass)+"'";
		ResultSet result = conexion.query(query);
		try {
			if (result.next()) {
				return true;
			}else return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Boolean agregar(String nombre, String apellido, String usuario, String pass) {
		DataBase conexion = DataBase.getInstance();
		String query = "INSERT INTO public.usuario(nombre, apellido, password, usuario) VALUES ( '"+nombre+"', '"+apellido+"', '"+DigestUtils.md5Hex(pass)+"', '"+usuario+"')";
		Boolean result = conexion.insert(query);
		System.out.println(result);
		return result;
		
	}

}
