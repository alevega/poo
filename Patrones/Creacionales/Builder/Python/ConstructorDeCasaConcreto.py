from ConstructorDeCasa import ConstructorDeCasa

class ConstructorDeCasaConcreto(ConstructorDeCasa):
    def construir_cimientos(self):
        self._casa.set_foundation("Cimientos de concreto")

    def construir_estructura(self):
        self._casa.set_estructura("Estructura de madera")

    def construir_techo(self):
        self._casa.set_techo("Techo de tejas")

    def construir_garage(self):
        self._casa.set_garage(True)

    def construir_piscina(self):
        self._casa.set_piscina(False)

    def construir_jardin(self):
        self._casa.set_jardin(True)


