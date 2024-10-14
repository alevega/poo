
from Cliente import Cliente
from Producto import Producto

# El producto es el sujeto, es el objeto OBSERVADO
producto = Producto("Notebook", 1500.00)

# Los clientes son los OBSERVADORES
cliente_1 = Cliente("Pablo")
cliente_2 = Cliente("Ale")

# Los clientes se suscriben al producto
producto.suscribir(cliente_1)
producto.suscribir(cliente_2)

# Cambiar el precio del producto, lo cual notifica a los suscriptores
producto.set_precio(1400.00)
print()
producto.set_precio(900.00)
