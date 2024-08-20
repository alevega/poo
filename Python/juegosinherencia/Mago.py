
class Mago:
    DANO_ESPADACHIN = 10
    DANO_LADRON = 20
    VIDA_POR_DEFECTO = 100

    def __init__(self, nombre):
        self._nombre = nombre
        self._vida = Mago.VIDA_POR_DEFECTO
    
    @classmethod    
    def Constructor(cls, nombre, vida):
        nuevoMago = cls(nombre, vida)
        return nuevoMago

    @property
    def nombre(self):
        return self._nombre

    @property
    def vida(self):
        return self._vida

    @vida.setter
    def vida(self, valor):
        if valor < 0:
            valor = 0
        self._vida = valor

    def recibir_dano(self, dano):
        self.vida -= dano

    def atacar_ladron(self, objetivo):
        print(f"{self.nombre} ataca a {objetivo.nombre}!")
        objetivo.recibir_dano(self.DANO_LADRON)
        print(f"{objetivo.nombre} tiene {objetivo.vida} puntos de vida restantes.\n")

    def atacar_espadachin(self, objetivo):
        print(f"{self.nombre} ataca a {objetivo.nombre}!")
        objetivo.recibir_dano(self.DANO_ESPADACHIN)
        print(f"{objetivo.nombre} tiene {objetivo.vida} puntos de vida restantes.\n")