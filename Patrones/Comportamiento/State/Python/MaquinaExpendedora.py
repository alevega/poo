from EstadoConcreto import SinDinero


# Máquina Expendedora (Contexto)
class MaquinaExpendedora:
    def __init__(self):
        # Estado inicial: Sin Dinero
        self.__estado_actual = SinDinero()

    # Cambiar el estado actual
    def set_estado(self, nuevo_estado):
        self.__estado_actual = nuevo_estado

    # Métodos que delegan la operación al estado actual
    def insertar_dinero(self):
        self.__estado_actual.insertar_dinero(self)

    def seleccionar_producto(self):
        self.__estado_actual.seleccionar_producto(self)

    def dispensar(self):
        self.__estado_actual.dispensar(self)