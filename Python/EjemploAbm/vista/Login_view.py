from customtkinter import *

class Login_view:
    
    def __init__(self):
        self.__ventana = CTk() 
        self.__ventana.eval('tk::PlaceWindow . center')
        self.__ventana.title('Login')
        self.__ventana.geometry("400x200")
        
        self.__lbl_usuario = CTkLabel(self.__ventana, text="Usuario",width=100, height=30)
        self.__lbl_usuario.place(relx=0.2,rely=0.18)
        
        self.__txt_usuario = CTkEntry(self.__ventana, width=100, height=20)
        self.__txt_usuario.place(relx=0.44,rely=0.19)
        
        self.__lbl_pass = CTkLabel(self.__ventana, text="Contraseña", width=100, height=30)
        self.__lbl_pass.place(relx=0.22,rely=0.35)
        
        self.__txt_pass = CTkEntry(self.__ventana,show="*", width=100, height=20)
        self.__txt_pass.place(relx=0.44,rely=0.37)
        
        self.__btn_ingresar = CTkButton(self.__ventana, text='Ingresar', width=100, height=20)
        self.__btn_ingresar.place(relx=0.44,rely=0.55)
        

    def get_ventana(self):
        return self.__ventana
    
    def get_btn_ingresar(self):
        return self.__btn_ingresar
    
    def get_txt_usuario(self):
        return self.__txt_usuario
    
    def get_txt_pass(self):
        return self.__txt_pass