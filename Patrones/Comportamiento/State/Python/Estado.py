from abc import ABC, abstractmethod

# Interfaz Estado (State)
class Estado(ABC):
    @abstractmethod
    def insertar_dinero(self, maquina):
        pass

    @abstractmethod
    def seleccionar_producto(self, maquina):
        pass

    @abstractmethod
    def dispensar(self, maquina):
        pass
