from Empleado import Empleado

class Supervisor(Empleado):
    def __init__(self, nombre, puesto):
        self.__nombre = nombre
        self.__puesto = puesto
        self.__subordinados = []

    def agregarSubordinado(self, empleado):
        self.__subordinados.append(empleado)

    def removerSubordinado(self, empleado):
        self.__subordinados.remove(empleado)

    def mostrarDetalles(self):
        print(f"Supervisor: {self.__nombre}, Puesto: {self.__puesto}")
        print("Subordinados:")
        
        for subordinado in self.__subordinados:
            subordinado.mostrarDetalles()  # Recursivamente muestra los detalles de subordinados

        print()