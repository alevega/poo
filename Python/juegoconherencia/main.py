import random
from Mago import Mago
from Espadachin import Espadachin
from Ladron import Ladron

def main():
    ejercito_norte = []
    ejercito_sur = []
    min = 10
    max = 70
    for i in range(0,5):
        ejercito_norte.append(Mago.Constructor("mago{}".format(i)))
        ejercito_norte.append(Ladron.Constructor_3("Ladron{}".format(i)))
        ejercito_norte.append(Espadachin.Constructor("Espadachin{}".format(i)))
        ejercito_sur.append(Mago.Constructor("mago{}".format(i)))
        ejercito_sur.append(Ladron.Constructor_3("Ladron{}".format(i)))
        ejercito_sur.append(Espadachin.Constructor("Espadachin{}".format(i)))

    random.shuffle(ejercito_norte)
    random.shuffle(ejercito_sur)

    pos = 0
    for personaje in ejercito_norte:
        personaje.atacar(ejercito_sur[pos], random.randint(min, max))
        if ejercito_sur[pos].get_vida() > 0:
            ejercito_sur[pos].atacar(personaje, random.randint(min, max))
        pos = pos+1
    
    print("Resultado Ejercito del sur")
    for personaje in ejercito_sur:
        print("{} tiene {} puntos de vida".format(personaje.get_nombre(), personaje.get_vida()))

        print("Resultado Ejercito del norte")
    for personaje in ejercito_norte:
        print("{} tiene {} puntos de vida".format(personaje.get_nombre(), personaje.get_vida()))

if __name__ == "__main__":
    main()