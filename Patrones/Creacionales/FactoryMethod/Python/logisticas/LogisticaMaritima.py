from Logistica import Logistica
from transportes.Barco import Barco

class LogisticaMaritima(Logistica):
    
    def _crear_transporte(self):
        return Barco()
