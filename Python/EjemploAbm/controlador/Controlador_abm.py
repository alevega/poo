from vista.Abm_view import Abm_view
from modelo.Usuario import Usuario
from controlador.Controlador_agregar import Controlador_agregar


class Controlador_abm:
    
    def __init__(self):
        self.__vista = Abm_view()
        self.__usuario = Usuario()
        self.__completar_tabla()
        self.__vista.get_btn_agregar().configure(command = self.__agregar_view)
        self.__vista.get_ventana().mainloop()
        
    def __completar_tabla(self):
        column = ['Nombre','Apellido','Usuario']
        values = self.__usuario.get_all()
        print(values)
        self.__vista.get_table().add_row(index=0,values=column)
        i = 1
        for val in values:
            self.__vista.get_table().add_row(index=i,values=val)
            i = i+1
    
    def __agregar_view(self):
        self.__vista.get_ventana().withdraw()
        Controlador_agregar(self.__vista)