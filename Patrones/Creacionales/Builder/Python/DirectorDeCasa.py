class DirectorDeCasa:
    def __init__(self, constructor_de_casa):
        self.__constructor_de_casa = constructor_de_casa

    def construir_casa_simple(self):
        self.__construccion_basica("Simple")
        self.__constructor_de_casa.construir_garage()

    def construir_casa_completa(self):
        self.__construccion_basica("Completa")
        self.__constructor_de_casa.construir_garage()
        self.__constructor_de_casa.construir_piscina()
        self.__constructor_de_casa.construir_jardin()

    def __construccion_basica(self, nombre):
        self.__constructor_de_casa.crear_nueva_casa(nombre)
        self.__constructor_de_casa.construir_cimientos()
        self.__constructor_de_casa.construir_estructura()
        self.__constructor_de_casa.construir_techo()

    def get_casa(self):
        return self.__constructor_de_casa.get_casa()