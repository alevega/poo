

class Reloj:
    
    def __init__(self):
        pass

    def informe(self, personal):
        for i in personal:
            i.set_horas_trabajadas()
            if i.get_cumplio():
                cump = "si"
            else:
                cump = "no"
            print("El empleado {}, {} cumplio con el horario, horas total = {}".format(i.get_nombre(),cump, i.get_horas_trabajadas()))