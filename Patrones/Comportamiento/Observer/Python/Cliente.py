from Observador import Observador

# Cliente concreto (Observador concreto)
class Cliente(Observador):
    def __init__(self, nombre: str):
        self.__nombre = nombre

    def actualizar(self, producto: str, precio: float):
        print(f"El cliente {self.__nombre} es notificado: El precio del producto {producto} se actualizó a ${precio:.2f}")

