from MaquinaExpendedora import MaquinaExpendedora

maquina = MaquinaExpendedora()

# Intentando seleccionar un producto sin insertar dinero
print("Seleccionar un producto...")
maquina.seleccionar_producto()

# Insertar dinero y seleccionar producto
print()
maquina.insertar_dinero()
print("Seleccionar un producto...")
maquina.seleccionar_producto()

# Dispensar el producto
print()
maquina.dispensar()

# Intentar dispensar nuevamente sin dinero
print()
print("Dispensar otro producto...")
maquina.dispensar()
