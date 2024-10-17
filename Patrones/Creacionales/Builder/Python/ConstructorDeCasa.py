from abc import ABC, abstractmethod
from Casa import Casa

class ConstructorDeCasa(ABC):
    def __init__(self):
        self._casa = None

    def get_casa(self):
        return self._casa

    def crear_nueva_casa(self, nombre):
        self._casa = Casa(nombre)

    @abstractmethod
    def construir_cimientos(self):
        pass

    @abstractmethod
    def construir_estructura(self):
        pass

    @abstractmethod
    def construir_techo(self):
        pass

    @abstractmethod
    def construir_garage(self):
        pass

    @abstractmethod
    def construir_piscina(self):
        pass

    @abstractmethod
    def construir_jardin(self):
        pass
