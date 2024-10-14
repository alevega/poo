# Producto (Sujeto que será observado)
class Producto:
    def __init__(self, nombre, precio):
        self.__nombre = nombre
        self.__precio = precio
        self.__suscriptores = []

    # Suscribir observadores
    def suscribir(self, cliente):
        self.__suscriptores.append(cliente)

    # Desuscribir observadores
    def desuscribir(self, cliente):
        self.__suscriptores.remove(cliente)

    # Cambiar precio y notificar a los suscriptores
    def set_precio(self, nuevo_precio):
        print(f"El producto {self.__nombre} cambió su precio de ${self.__precio:.2f} a ${nuevo_precio:.2f}")
        self.__precio = nuevo_precio
        self.__notificar()

    # Notificar a los observadores
    def __notificar(self):
        for cliente in self.__suscriptores:
            cliente.actualizar(self.__nombre, self.__precio)
