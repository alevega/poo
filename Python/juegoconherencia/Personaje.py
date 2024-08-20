from abc import ABC, abstractmethod

class Personaje(ABC):
    
    
    def __init__(self, nombre:str, vida:int):
        self._nombre = nombre
        self._vida = vida
    
    def get_nombre(self):
        return self._nombre
    
    def get_vida(self):
        return self._vida
    
    def recibir_dano(self, dano:int):
        self._vida -= dano
        if self._vida < 0:
            self._vida = 0
    
    def atacar(self, objetivo, dano:int):
        print("{} ataca a {} !".format(self._nombre, objetivo.get_nombre()))
        self.recibir_dano(dano)
        print("{} tiene {} puntos de vida restantes.".format(objetivo.get_nombre(), objetivo.get_vida()))
    
    @abstractmethod
    def __habilidad_especial__(self, dano):
        pass