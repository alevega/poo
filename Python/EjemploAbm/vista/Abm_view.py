from customtkinter import *
from CTkTable import *

class Abm_view:
    
    def __init__(self):
        self.__ventana = CTk()
        self.__ventana.title('Abm Usuarios')
        posx = 400
        posy = 200
        self.__ventana.geometry("800x640+{}+{}".format(posx,posy))
                
        self.__table = CTkTable(master=self.__ventana, column=3)
        self.__table.place(relx=0.1,rely=0.18)
        
        self.__btn_agregar = CTkButton(self.__ventana, text='Agregar Usuario', width=130, height=20)
        self.__btn_agregar.place(relx=0.70,rely=0.20)

    def get_ventana(self):
        return self.__ventana

    def get_table(self):
        return self.__table

    def get_btn_agregar(self):
        return self.__btn_agregar