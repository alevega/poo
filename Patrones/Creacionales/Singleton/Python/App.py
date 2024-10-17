from BaseDeDatos import BaseDeDatos

# Obtener la instancia única de la base de datos
bd1 = BaseDeDatos.obtener_instancia()
bd1.ejecutar_consulta("SELECT * FROM usuarios")

# Intentar obtener otra instancia de la base de datos
bd2 = BaseDeDatos.obtener_instancia()
bd2.ejecutar_consulta("SELECT * FROM productos")

# Comprobar que ambas instancias son iguales
if bd1 == bd2:
    print("Ambas referencias apuntan a la misma instancia.")
