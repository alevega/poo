from EstrategiaDePago import EstrategiaDePago


# Estrategia de pago con Débito (o Debito)
class PagoConDebito(EstrategiaDePago):

    def __init__(self, email):
        self.__email = email

    def pagar(self, monto):
        print(f"Pagando {monto} usando Debito. Email: {self.__email}")
