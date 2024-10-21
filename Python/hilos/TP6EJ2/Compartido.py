

class Compartido:
    
    def __init__(self):
        self.__contador = 0
    
    def incrementar(self):
        self.__contador += 1
    
    def get_contador(self):
        return self.__contador