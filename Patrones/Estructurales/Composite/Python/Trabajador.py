from Empleado import Empleado

class Trabajador(Empleado):
    def __init__(self, nombre, puesto):
        self.__nombre = nombre
        self.__puesto = puesto

    def mostrarDetalles(self):
        print("Trabajador: " + self.__nombre + ", Puesto: " + self.__puesto)
        print()
