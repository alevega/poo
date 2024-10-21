from multiprocessing import Process

class Hilo(Process):
    
    def __init__(self,contador):
        super().__init__()
        self.__contador = contador
    
    
    def run(self):
        for i in range(5000):
            self.__contador.incrementar()