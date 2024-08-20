

class Espadachin:
    DANO_LADRON = 15
    DANO_MAGO = 10
    VIDA_POR_DEFECTO = 100

    # miObjetoEspadachin = Espadachin.Constructor(nombre, vida)
    @classmethod
    def Constructor(cls, nombre, vida):
        nuevoEspadachin = cls(nombre)
        nuevoEspadachin.__nombre = nombre
        nuevoEspadachin.__vida = vida
        return nuevoEspadachin

    def __init__(self, nombre):
        self.__nombre = nombre
        self.__vida = Espadachin.VIDA_POR_DEFECTO

    ##################################
    # Getter de nombre, las dos formas cumplen el mismo proposito
    # Las dos formas equivalen al getNombre de Java

    # Se accede como miObjetoEspadachin.getNombre()
    def getNombre(self):
        return self.__nombre

    @property
    def nombre(self):
        return self.__nombre

    ##################################

    def getVida(self):
        return self.__vida

    @property
    def vida(self):
        return self.__vida

    @vida.setter
    def vida(self, valor):
        if valor < 0:
            valor = 0
        self.__vida = valor

    def recibir_dano(self, dano):
        self.vida -= dano

    def atacar_mago(self, objetivo):
        print(f"{self.nombre} ataca a {objetivo.nombre}!")
        objetivo.recibir_dano(self.DANO_MAGO)
        print(
            f"{objetivo.nombre} tiene {objetivo.vida} puntos de vida restantes.\n"
        )

    def atacar_ladron(self, objetivo):
        print(f"{self.nombre} ataca a {objetivo.nombre}!")
        objetivo.recibir_dano(self.DANO_LADRON)
        print(
            f"{objetivo.nombre} tiene {objetivo.vida} puntos de vida restantes.\n"
        )