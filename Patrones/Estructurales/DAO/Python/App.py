import mysql.connector
from mysql.connector import Error
from Usuario import Usuario
from UsuarioDAOImpl import UsuarioDAOImpl

try:
    # Configuración de conexión a la base de datos MySQL
    conexion = mysql.connector.connect(
        host='localhost',
        database='mi_basededatos',
        user='root',
        password='12345'
    )

    if conexion.is_connected():
        usuario_dao = UsuarioDAOImpl(conexion)

        # Insertar un nuevo usuario
        nuevo_usuario = Usuario(0, "Juan Pérez", "juan.perez@email.com")
        usuario_dao.insertar_usuario(nuevo_usuario)

        # Obtener todos los usuarios
        usuarios = usuario_dao.obtener_todos_los_usuarios()
        for usuario in usuarios:
            print(usuario)

        # Actualizar un usuario
        usuario_actualizado = usuarios[0]
        usuario_actualizado.nombre = "Juan Actualizado"
        usuario_dao.actualizar_usuario(usuario_actualizado)

        # Obtener un usuario por ID
        usuario_por_id = usuario_dao.obtener_usuario_por_id(usuario_actualizado.id_usuario)
        print("Usuario obtenido por ID:", usuario_por_id)

        # Eliminar un usuario
        usuario_dao.eliminar_usuario(usuario_actualizado.id_usuario)

except Error as e:
    print("Error al conectar a la base de datos", e)

finally:
    if conexion.is_connected():
        conexion.close()
        print("Conexión cerrada")