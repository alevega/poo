from vista.Agregar_view import Agregar_view
from modelo.Usuario import Usuario

class Controlador_agregar:
    
    def __init__(self, vista_anterior):
        self.__vista_anterior = vista_anterior
        self.__vista = Agregar_view()
        self.__usuario = Usuario()
        self.__vista.get_btn_agregar().configure(command = self.__agregar)
        self.__vista.get_ventana().mainloop()
    
    def __agregar(self):
        nombre = self.__vista.get_txt_nombre().get()
        apellido = self.__vista.get_txt_apellido().get()
        usuario = self.__vista.get_txt_usuario().get()
        passw = self.__vista.get_txt_pass().get()
        #revisar esto
        if self.__usuario.insert(nombre, apellido, usuario, passw) == None:
            self.__vista.get_ventana().withdraw()
            self.__vista_anterior.get_ventana().deiconify()