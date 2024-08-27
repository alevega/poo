
#Excepciones

num = 5
num2 = 0

try:
    resultado = num/num2
except ZeroDivisionError:
    print("La division por cero no se puede realizar")
else:
    print("no ocurrio ninguna excepcion")
    

class Miexcepcion(Exception):
    
    def __init__(self, mensaje):
        self.mensaje = mensaje
        

def metodo():
    nombre = 'ale'
    if nombre != 'pepe':
        raise Miexcepcion("El ingreso por teclado estuo mal volve a ingresarlo")
    

try:
    metodo()
except Miexcepcion as ex:
    print(ex.mensaje)
