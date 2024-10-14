from abc import methodoverride

class Usuario:
    
    def __init__(self, id, nombre, email):
        self.__id = id
        self.__nombre = nombre
        self.__email = email

    # Getters y setters
    def getId(self):
        return self.__id

    def setId(self, id):
        self.id = id

    def getNombre(self):
        return self.__nombre

    def setNombre(self, nombre):
        self.__nombre = nombre

    def getEmail(self):
        return self.__email

    def setEmail(self, email):
        self.__email = email

    def __str__(self):
        return f"Usuario [id={self.__id}, nombre={self.__nombre}, email={self.__email}]"
