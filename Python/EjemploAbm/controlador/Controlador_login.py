from controlador.Controlador_abm import Controlador_abm
from vista.Login_view import Login_view
from modelo.Usuario import Usuario

class Controlador_login:
    
    def __init__(self):
        self.__musuario = Usuario()
        self.__vista = Login_view()
        self.__vista.get_btn_ingresar().configure(command = self.__login)
        self.__vista.get_ventana().mainloop()
    
    def __login(self):
        usuario = self.__vista.get_txt_usuario().get()
        passw = self.__vista.get_txt_pass().get()
        if self.__musuario.login(usuario,passw):
            self.__vista.get_ventana().withdraw()
            Controlador_abm()