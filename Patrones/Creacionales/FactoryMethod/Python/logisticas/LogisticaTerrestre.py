from Logistica import Logistica
from transportes.Camion import Camion

class LogisticaTerrestre(Logistica):
    
    def _crear_transporte(self):
        return Camion()
