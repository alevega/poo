from EstrategiaDePago import EstrategiaDePago


# Estrategia de pago con Débito (o PayPal)
class PagoConDebito(EstrategiaDePago):

    def __init__(self, email):
        self.__email = email

    def pagar(self, monto):
        print(f"Pagando {monto} usando PayPal. Email: {self.__email}")
