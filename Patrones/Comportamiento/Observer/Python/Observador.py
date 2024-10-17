from abc import ABC, abstractmethod

# Interfaz Observador (Cliente)
class Observador(ABC):
    
    @abstractmethod
    def actualizar(self, producto, precio):
        pass

