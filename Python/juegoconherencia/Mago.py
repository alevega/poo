from Personaje import Personaje
import random

class Mago(Personaje):
    
    VIDA_POR_DEFECTO = 100
    
    def __init__(self, nombre: str, vida: int):
        super().__init__(nombre, vida)
    
    @classmethod    
    def Constructor(cls, nombre):
        nuevoMago = cls(nombre, cls.VIDA_POR_DEFECTO)
        return nuevoMago
    
    def recibir_dano(self, dano: int):
        if random.randint(0,2) == 1:
            dano = self.__habilidad_especial__(dano)
        super().recibir_dano(dano)
        
    def __habilidad_especial__(self, dano):
        return int(dano*0.2)