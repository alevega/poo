from EstrategiaDePago import EstrategiaDePago


# Estrategia de pago con tarjeta de crédito
class PagoConTarjetaDeCredito(EstrategiaDePago):

    def __init__(self, numero_tarjeta, titular):
        self.__numero_tarjeta = numero_tarjeta
        self.__titular = titular

    def pagar(self, monto):
        print(
            f"Pagando {monto} usando tarjeta de crédito. Detalles: "
            f"Número de tarjeta: {self.__numero_tarjeta}, Titular: {self.__titular}"
        )
