from Estado import Estado

# Coloco todos los estados concretos en un mismo archivo para evitar problemas de referencia circular

class ProductoAgotado(Estado):
    def insertar_dinero(self, maquina):
        print("No puedes insertar dinero. El producto está agotado.")

    def seleccionar_producto(self, maquina):
        print("Producto agotado. No puedes seleccionarlo.")

    def dispensar(self, maquina):
        print("Producto agotado. No se puede dispensar.")
        
class ProductoSeleccionado(Estado):
    def insertar_dinero(self, maquina):
        print("Ya has seleccionado un producto. Espera la dispensación.")

    def seleccionar_producto(self, maquina):
        print("Ya seleccionaste un producto. Espera la dispensación.")

    def dispensar(self, maquina):
        print("Dispensando el producto...")
        maquina.set_estado(SinDinero())
        
class SinDinero(Estado):
    def insertar_dinero(self, maquina):
        print("Dinero insertado correctamente.")
        maquina.set_estado(ConDinero())

    def seleccionar_producto(self, maquina):
        print("No puedes seleccionar un producto sin insertar dinero.")

    def dispensar(self, maquina):
        print("Primero debes insertar dinero.")

class ConDinero(Estado):
    def insertar_dinero(self, maquina):
        print("Ya has insertado dinero. Selecciona un producto.")

    def seleccionar_producto(self, maquina):
        print("Producto seleccionado.")
        maquina.set_estado(ProductoSeleccionado())

    def dispensar(self, maquina):
        print("Primero selecciona un producto.")