from DecoradorBebida import DecoradorBebida

# Clase concreta Azúcar que extiende DecoradorBebida
class Azucar(DecoradorBebida):

    def get_descripcion(self):
        return self._bebida_decorada.get_descripcion() + ", con Azúcar"

    def get_costo(self):
        return self._bebida_decorada.get_costo() + 5.0
