from Cafe import Cafe
from Leche import Leche
from Azucar import Azucar

# Crear un café básico
mi_cafe = Cafe()
print(f"{mi_cafe.get_descripcion()} cuesta ${str(mi_cafe.get_costo())}")

# Agregarle leche al café
mi_cafe = Leche(mi_cafe)
print(f"{mi_cafe.get_descripcion()} cuesta ${str(mi_cafe.get_costo())}")

# Agregarle azúcar al café con leche
mi_cafe = Azucar(mi_cafe)
print(f"{mi_cafe.get_descripcion()} cuesta ${str(mi_cafe.get_costo())}")