from Persona import Persona
import random

class NoDocente(Persona):
    
    def __init__(self, nombre, antiguedad, sector, jornada):
        super().__init__(nombre, antiguedad, sector)
        self.__jornada = jornada
    
    def set_horas_trabajadas(self):
        if random.randint(1,100) <= 80:
            if self.__jornada == 'Completa':
                self._horas_trabajadas = random.randint(30,40)
                self._cumplio = True
            if self.__jornada == 'Reducida':
                self._horas_trabajadas = random.randint(20,30)
                self._cumplio = True
                
