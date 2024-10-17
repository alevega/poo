from abc import ABC, abstractmethod


# Interfaz EstrategiaDePago (Strategy)
class EstrategiaDePago(ABC):

    @abstractmethod
    def pagar(self, monto):
        pass
