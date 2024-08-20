from Mago import Mago
from Espadachin import Espadachin
from Ladron import Ladron

def main():
    mago = Mago("Gandalf")
    espadachin = Espadachin.Constructor("Aragorn", 150)
    ladron = Ladron.Constructor_2("Frodo")

    ladron.atacar_espadachin(espadachin)
    espadachin.atacar_ladron(ladron)

    mago.atacar_espadachin(espadachin)
    espadachin.atacar_mago(mago)

    mago.atacar_ladron(ladron)
    ladron.atacar_mago(mago)

    print("Otro personaje se suma la batalla\n")

    espadachin2 = Espadachin("Faramir")

    espadachin2.atacar_mago(mago)

    print("Otro personaje se suma la batalla\n")

    ladron2 = Ladron.Constructor_2("Ladrón Sin Nombre")

    ladron2.atacar_espadachin(espadachin)

    print("Resultado")
    print(f"{espadachin.getNombre()} tiene {espadachin.vida} puntos de vida")
    print(f"{mago.nombre} tiene {mago.vida} puntos de vida")
    print(f"{ladron.nombre} tiene {ladron.vida} puntos de vida")


if __name__ == "__main__":
    main()