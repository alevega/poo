
class Ladron:
    DANO_ESPADACHIN = 5
    DANO_MAGO = 10
    VIDA_POR_DEFECTO = 80

    def __init__(self, nombre, vida):
        self._nombre = nombre
        self._vida = vida
        
    @classmethod
    def Constructor(cls):
        nuevoLadron = cls("Ladron Generico 44", Ladron.VIDA_POR_DEFECTO)
        return nuevoLadron
    
    @classmethod
    def Constructor_2(cls, nombre):
        nuevoLadron = cls(nombre, Ladron.VIDA_POR_DEFECTO)
        return nuevoLadron

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

    def atacar_mago(self, objetivo):
        print(f"{self.nombre} ataca a {objetivo.nombre}!")
        objetivo.recibir_dano(self.DANO_MAGO)
        print(f"{objetivo.nombre} tiene {objetivo.vida} puntos de vida restantes.\n")

    def atacar_espadachin(self, objetivo):
        print(f"{self.nombre} ataca a {objetivo.nombre}!")
        objetivo.recibir_dano(self.DANO_ESPADACHIN)
        print(f"{objetivo.nombre} tiene {objetivo.vida} puntos de vida restantes.\n")