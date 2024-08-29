from abc import ABC

class Persona(ABC):
    
    def __init__(self, nombre, antiguedad, sector):
        self._nombre = nombre
        self._antiguedad = antiguedad
        self._sector = sector
        self._horas_trabajadas = 0
        self._cumplio = False
    
    def set_horas_trabajadas(self):
        pass

    def get_horas_trabajadas(self):
        return self._horas_trabajadas
    
    def get_cumplio(self):
        return self._cumplio

    def get_nombre(self):
        return self._nombre