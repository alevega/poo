from Hilo import Hilo
from Compartido import Compartido

if __name__ == '__main__':

    hilos = []
    contador = Compartido()

    for  i in range(4):
        h = Hilo(contador)
        h.start()
        h.join()


    print("El contador es {}".format(contador.get_contador()))