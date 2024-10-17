import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/mi_basededatos";
        String usuario = "root";
        String password = "12345";

        try (Connection conexion = DriverManager.getConnection(url, usuario, password)) {
            UsuarioDAO usuarioDAO = new UsuarioDAOImpl(conexion);

            // Insertar un nuevo usuario
            Usuario nuevoUsuario = new Usuario(0, "Juan Pérez", "juan.perez@email.com");
            usuarioDAO.insertarUsuario(nuevoUsuario);

            // Obtener todos los usuarios
            List<Usuario> usuarios = usuarioDAO.obtenerTodosLosUsuarios();
            for (Usuario u : usuarios) {
                System.out.println(u);
            }

            // Actualizar un usuario
            Usuario usuarioActualizado = usuarios.get(0);
            usuarioActualizado.setNombre("Juan Actualizado");
            usuarioDAO.actualizarUsuario(usuarioActualizado);

            // Obtener un usuario por ID
            Usuario usuarioPorId = usuarioDAO.obtenerUsuarioPorId(usuarioActualizado.getId());
            System.out.println("Usuario obtenido por ID: " + usuarioPorId);

            // Eliminar un usuario
            usuarioDAO.eliminarUsuario(usuarioActualizado.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
