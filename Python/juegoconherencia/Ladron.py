from Personaje import Personaje

class Ladron(Personaje):
    
    VIDA_POR_DEFECTO = 80
    
    def __init__(self, nombre: str, vida: int):
        super().__init__(nombre, vida)
    
    @classmethod    
    def Constructor_2(cls):
        nuevoLadron = cls("Ladron Generico 44", cls.VIDA_POR_DEFECTO)
        return nuevoLadron
    
    @classmethod    
    def Constructor_3(cls, nombre):
        nuevoLadron = cls(nombre, cls.VIDA_POR_DEFECTO)
        return nuevoLadron
    
    def recibir_dano(self, dano: int):
        super().recibir_dano(dano)
        self.__habilidad_especial__(dano)
    
    def __habilidad_especial__(self, dano):
        print("Ha robado un item")
        return dano