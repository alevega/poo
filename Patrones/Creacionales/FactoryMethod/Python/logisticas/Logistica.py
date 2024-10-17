from abc import ABC, abstractmethod

class Logistica(ABC):
    
    @abstractmethod
    def _crear_transporte(self):
        pass

    def planificar_entrega(self):
        transporte = self._crear_transporte()
        transporte.entregar()

