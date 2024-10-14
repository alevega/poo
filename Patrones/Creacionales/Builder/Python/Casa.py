class Casa:
    def __init__(self, nombre):
        self.__nombre = nombre
        self.__cimientos = None
        self.__estructura = None
        self.__techo = None
        self.__tiene_garage = False
        self.__tiene_piscina = False
        self.__tiene_jardin = False

    def set_foundation(self, cimientos):
        self.__cimientos = cimientos

    def set_estructura(self, estructura):
        self.__estructura = estructura

    def set_techo(self, techo):
        self.__techo = techo

    def set_garage(self, tiene_garage):
        self.__tiene_garage = tiene_garage

    def set_piscina(self, tiene_piscina):
        self.__tiene_piscina = tiene_piscina

    def set_jardin(self, tiene_jardin):
        self.__tiene_jardin = tiene_jardin

    def __str__(self):
        detalles = f"Casa {self.__nombre}\n[\nCimientos: {self.__cimientos}\nEstructura: {self.__estructura}\nTecho: {self.__techo}"
        if self.__tiene_garage:
            detalles += "\ntiene Garage"
        if self.__tiene_piscina:
            detalles += "\ntiene Piscina"
        if self.__tiene_jardin:
            detalles += "\ntiene Jardin"
        detalles += "\n]"
        return detalles


