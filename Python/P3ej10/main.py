import random
from Docente import Docente
from NoDocente import NoDocente
from Reloj import Reloj

categorias = ["Simple","Semiexclusiva","Exclusiva"]
jornadas = ["Completa", "Reducida"]
personal = []
for i in range(10):
    opcion = random.randint(0,1)
    if opcion == 0:
        personal.append(Docente("nombre", random.randint(1,10), "sector", categorias[random.randint(0,2)]))
    else:
        personal.append(NoDocente("nombre", random.randint(1,10), "sector", jornadas[random.randint(0,1)]))
    
reloj = Reloj()
reloj.informe(personal)