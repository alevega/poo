from abc import ABC, abstractmethod

class UsuarioDAO(ABC):
    
    @abstractmethod
    def obtenerUsuarioPorId(self, id):
        pass

    @abstractmethod
    def obtenerTodosLosUsuarios(self):
        pass

    @abstractmethod
    def insertarUsuario(self, usuario):
        pass

    @abstractmethod
    def actualizarUsuario(self, usuario):
        pass

    @abstractmethod
    def eliminarUsuario(self, id):
        pass