from customtkinter import *

class Agregar_view:
    
    def __init__(self):
        self.__ventana = CTk()
        self.__ventana.title('Abm Usuarios')
        posx = 400
        posy = 200
        self.__ventana.geometry("800x640+{}+{}".format(posx,posy))
        
        self.__lbl_nombre = CTkLabel(self.__ventana, text="Nombre",width=100, height=30)
        self.__lbl_nombre.place(relx=0.2,rely=0.10)
        self.__txt_nombre = CTkEntry(self.__ventana, width=100, height=20)
        self.__txt_nombre.place(relx=0.35,rely=0.11)
        
        self.__lbl_apellido = CTkLabel(self.__ventana, text="Apellido",width=100, height=30)
        self.__lbl_apellido.place(relx=0.2,rely=0.15)
        self.__txt_apellido = CTkEntry(self.__ventana, width=100, height=20)
        self.__txt_apellido.place(relx=0.35,rely=0.16)
        
        self.__lbl_usuario = CTkLabel(self.__ventana, text="Usuario",width=100, height=30)
        self.__lbl_usuario.place(relx=0.2,rely=0.20)
        self.__txt_usuario = CTkEntry(self.__ventana, width=100, height=20)
        self.__txt_usuario.place(relx=0.35,rely=0.21)
        
        self.__lbl_pass = CTkLabel(self.__ventana, text="Contraseña", width=100, height=30)
        self.__lbl_pass.place(relx=0.2,rely=0.26)
        self.__txt_pass = CTkEntry(self.__ventana,show="*", width=100, height=20)
        self.__txt_pass.place(relx=0.35,rely=0.26)
        
        self.__btn_agregar = CTkButton(self.__ventana, text='Agregar', width=100, height=20)
        self.__btn_agregar.place(relx=0.35,rely=0.32)
    
    def get_ventana(self):
        return self.__ventana
    
    def get_btn_agregar(self):
        return self.__btn_agregar
    
    def get_txt_nombre(self):
        return self.__txt_nombre
    
    def get_txt_apellido(self):
        return self.__txt_apellido
    
    def get_txt_usuario(self):
        return self.__txt_usuario
    
    def get_txt_pass(self):
        return self.__txt_pass