
from abc import ABC, abstractmethod

# Transporte Interface
class Transporte(ABC):
    
    @abstractmethod
    def entregar(self):
        pass

