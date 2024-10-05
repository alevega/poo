from modelo.UsuarioDao import UsuarioDao


class Usuario:
    
    def __init__(self):
        self.__usudao = UsuarioDao()
    
    def login(self, usuario, passw):
        return self.__usudao.login(usuario,passw)
    
    def get_all(self):
        return self.__usudao.get_all()
    
    def insert(self,nombre, apellido, usuario, passw):
        return self.__usudao.insert(nombre, apellido, usuario, passw)