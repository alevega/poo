from Hilo import Hilo
from Compartido import Compartido

hilos = []
contador = Compartido()

for  i in range(4):
    hilo = Hilo(contador)
    hilos.append(hilo)
    hilo.start()

print("El contador es {}".format(contador.get_contador()))