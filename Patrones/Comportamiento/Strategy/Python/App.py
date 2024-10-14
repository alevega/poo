from Tienda import Tienda
from PagoConTarjetaDeCredito import PagoConTarjetaDeCredito
from PagoConDebito import PagoConDebito
from PagoConBitcoin import PagoConBitcoin

tienda = Tienda()

# Usar la estrategia de pago con tarjeta de crédito
tienda.set_estrategia_de_pago(PagoConTarjetaDeCredito("1234 5678 9876 5432", "Juan Pérez"))
tienda.pagar(100.0)

print()

# Usar la estrategia de pago con Debito (Débito)
tienda.set_estrategia_de_pago(PagoConDebito("juan.perez@example.com"))
tienda.pagar(150.0)

print()

# Usar la estrategia de pago con Bitcoin
tienda.set_estrategia_de_pago(PagoConBitcoin("direccion-de-wallet"))
tienda.pagar(200.0)
