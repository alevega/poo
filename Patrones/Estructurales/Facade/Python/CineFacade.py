from Proyector import Proyector
from SistemaDeSonido import SistemaDeSonido
from Boleto import Boleto

class CineFacade:
    
    def __init__(self):
        self.__proyector = Proyector()
        self.__sistemaDeSonido = SistemaDeSonido()
        self.__boleto = Boleto()

    # Método que combina todas las operaciones complejas en una sola llamada
    def iniciarCine(self, asiento, volumen):
        #  Reservar boleto
        self.__boleto.reservarAsiento(asiento)
        
        #  Encender el proyector
        self.__proyector.encender()
        self.__proyector.configurarEntrada()

        #  Encender y configurar el sistema de sonido
        self.__sistemaDeSonido.encender()
        self.__sistemaDeSonido.ajustarVolumen(volumen)

    def apagarCine(self):
        self.__proyector.apagar()
        self.__sistemaDeSonido.apagar()
