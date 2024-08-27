from vista.Vista1 import Vista1
from controlador.Controlador2 import Controlador2
class Controlador1:

    def __init__(self):
        self.__vista = Vista1(self)
        self.__vista.show()
        
    def abrirSegunda(self):
        self.var = Controlador2()
        self.__vista.close()