from datetime import datetime

class BaseDeDatos:
    # Variable de clase para almacenar la única instancia
    __instancia = None

    # Constructor privado para evitar instanciación directa
    def __init__(self):
        if BaseDeDatos.__instancia is not None:
            raise Exception("Esta clase es un Singleton. Usa obtener_instancia()")
        else:
            self.__name = f"MiBaseDeDatos {datetime.now().strftime("%H:%M:%S")}"
            print("Conectando a la base de datos...")

    # Método estático para obtener la única instancia de la clase
    @staticmethod
    def obtener_instancia():
        if BaseDeDatos.__instancia is None:
            BaseDeDatos.__instancia = BaseDeDatos()
        return BaseDeDatos.__instancia

    # Un método de ejemplo para demostrar el uso de la instancia única
    def ejecutar_consulta(self, consulta):
        print(f"Ejecutando consulta: {consulta} con BD: {self.__name}")
