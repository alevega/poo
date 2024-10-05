from modelo.bd import Database
import hashlib

class UsuarioDao:
    
    def __init__(self):
        self.__bd = Database()
    
    def login(self, usuario, passw):
        md5 = hashlib.new("md5")
        md5.update(passw.encode())
        result = self.__bd.get("SELECT * FROM usuario WHERE usuario = '{}' AND password = '{}'".format(usuario,md5.hexdigest()))
        if result:
            return True
        return False

    def get_all(self):
        return self.__bd.getAll("SELECT nombre,apellido, usuario FROM usuario")

    def insert(self,nombre, apellido, usuario, passw):
        md5 = hashlib.new("md5")
        md5.update(passw.encode())
        return self.__bd.query("INSERT INTO public.usuario(nombre, apellido, password, usuario) VALUES ( '{}', '{}', '{}', '{}');".format(nombre, apellido,md5.hexdigest(),usuario))