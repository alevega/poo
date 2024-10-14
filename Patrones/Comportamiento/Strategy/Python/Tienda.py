# Clase Tienda que usa la estrategia de pago
class Tienda:

    def __init__(self):
        self.__estrategia_de_pago = None

    # Permitir al usuario elegir el método de pago
    def set_estrategia_de_pago(self, estrategia_de_pago):
        self.__estrategia_de_pago = estrategia_de_pago

    # Realizar el pago usando la estrategia seleccionada
    def pagar(self, monto):
        if self.__estrategia_de_pago is not None:
            self.__estrategia_de_pago.pagar(monto)
        else:
            print("No se ha seleccionado una estrategia de pago.")
