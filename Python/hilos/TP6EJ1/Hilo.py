from threading import Thread
import time

class Hilo(Thread):
    
    def __init__(self, numero):
        super().__init__()
        self.__numero = numero

    def run(self):
        time.sleep(self.__numero)
        print("hola mundo hilo {}".format(self.__numero))