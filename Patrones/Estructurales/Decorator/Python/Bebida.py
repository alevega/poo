from abc import ABC, abstractmethod

# Interfaz Bebida
class Bebida(ABC):

    @abstractmethod
    def get_descripcion(self):
        pass

    @abstractmethod
    def get_costo(self):
        pass
