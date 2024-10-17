from DecoradorBebida import DecoradorBebida

# Clase concreta Leche que extiende DecoradorBebida
class Leche(DecoradorBebida):
    
    def get_descripcion(self):
        return self._bebida_decorada.get_descripcion() + ", con Leche"

    def get_costo(self):
        return self._bebida_decorada.get_costo() + 10.0
