from EstrategiaDePago import EstrategiaDePago


# Estrategia de pago con Bitcoin
class PagoConBitcoin(EstrategiaDePago):

    def __init__(self, direccion_wallet):
        self.__direccion_wallet = direccion_wallet

    def pagar(self, monto):
        print(f"Pagando {monto} usando Bitcoin. Wallet: {self.__direccion_wallet}")
