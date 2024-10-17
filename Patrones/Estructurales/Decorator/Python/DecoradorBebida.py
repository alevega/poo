from Bebida import Bebida

# Clase abstracta DecoradorBebida que implementa Bebida
class DecoradorBebida(Bebida):

    def __init__(self, bebida_decorada):
        self._bebida_decorada = bebida_decorada

    def get_descripcion(self):
        return self._bebida_decorada.get_descripcion()

    def get_costo(self):
        return self._bebida_decorada.get_costo()
