import mysql.connector
from mysql.connector import Error
from Usuario import Usuario

class UsuarioDAOImpl:
    def __init__(self, conexion):
        self.__conexion = conexion

    def obtener_usuario_por_id(self, id):
        usuario = None
        query = "SELECT * FROM usuarios WHERE id = %s"
        try:
            cursor = self.__conexion.cursor()
            cursor.execute(query, (id,))
            row = cursor.fetchone()
            if row:
                usuario = Usuario(row[0], row[1], row[2])
        except Error as e:
            print(f"Error al obtener usuario por ID: {e}")
        return usuario

    def obtener_todos_los_usuarios(self):
        usuarios = []
        query = "SELECT * FROM usuarios"
        try:
            cursor = self.__conexion.cursor()
            cursor.execute(query)
            rows = cursor.fetchall()
            for row in rows:
                usuario = Usuario(row[0], row[1], row[2])
                usuarios.append(usuario)
        except Error as e:
            print(f"Error al obtener todos los usuarios: {e}")
        return usuarios

    def insertar_usuario(self, usuario):
        query = "INSERT INTO usuarios (nombre, email) VALUES (%s, %s)"
        try:
            cursor = self.__conexion.cursor()
            cursor.execute(query, (usuario.nombre, usuario.email))
            self.__conexion.commit()
        except Error as e:
            print(f"Error al insertar usuario: {e}")

    def actualizar_usuario(self, usuario):
        query = "UPDATE usuarios SET nombre = %s, email = %s WHERE id = %s"
        try:
            cursor = self.__conexion.cursor()
            cursor.execute(query, (usuario.nombre, usuario.email, usuario.id_usuario))
            self.__conexion.commit()
        except Error as e:
            print(f"Error al actualizar usuario: {e}")

    def eliminar_usuario(self, id):
        query = "DELETE FROM usuarios WHERE id = %s"
        try:
            cursor = self.__conexion.cursor()
            cursor.execute(query, (id,))
            self.__conexion.commit()
        except Error as e:
            print(f"Error al eliminar usuario: {e}")
