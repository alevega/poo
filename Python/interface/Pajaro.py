from abc import ABC
from Volar import Volar

class Pajaro(ABC, Volar):
    
    def __init__(self):
        pass
    
    def despegar(self):
        print("La gaviota toma carrera y emprende vuelo")
    
    def planear(self):
        pass
    
    def aterrizar(self):
        pass