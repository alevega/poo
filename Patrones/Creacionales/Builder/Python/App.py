from ConstructorDeCasaConcreto import ConstructorDeCasaConcreto
from DirectorDeCasa import DirectorDeCasa

constructor_de_casa = ConstructorDeCasaConcreto()
director = DirectorDeCasa(constructor_de_casa)

director.construir_casa_simple()
casa_simple = director.get_casa()

director.construir_casa_completa()
casa_completa = director.get_casa()

print()
print(casa_simple)

print()
print(casa_completa)
