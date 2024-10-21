from multiprocessing import Value

class Compartido():
    
    def __init__(self):
        self.__contador = Value('i',0)
    
    def incrementar(self):
        self.__contador.value += 1
    
    def get_contador(self):
        return self.__contador.value