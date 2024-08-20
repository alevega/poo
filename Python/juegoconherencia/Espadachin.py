from Personaje import Personaje
import random

class Espadachin(Personaje):
    
    def __init__(self, nombre: str, vida: int):
        super().__init__(nombre, vida)
    
    @classmethod    
    def Constructor(cls, nombre):
        nuevoLadron = cls(nombre, 100)
        return nuevoLadron
    
    def atacar(self, objetivo, dano: int):
        if random.randint(0,1) == 1:
            dano = self.__habilidad_especial__(dano)
        super().atacar(objetivo, dano)
    
    def __habilidad_especial__(self, dano):
        return dano*20