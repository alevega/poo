from abc import ABC, abstractmethod

class Empleado(ABC):
    
    @abstractmethod
    def mostrarDetalles(self):
        pass
