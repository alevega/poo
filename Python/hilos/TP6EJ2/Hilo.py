from threading import Thread, Lock

class Hilo(Thread):
    
    def __init__(self, contador):
        super().__init__()
        self.__lock = Lock()
        self.__contador = contador
    
    def run(self):
        for i in range(5000):
            with self.__lock:
                self.__contador.incrementar()