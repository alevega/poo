from Trabajador import Trabajador
from Supervisor import Supervisor

# Crear trabajadores individuales
trabajador1 = Trabajador("Carlos Perez", "Desarrollador")
trabajador2 = Trabajador("Ana Lopez", "Diseñadora")
trabajador3 = Trabajador("Mario Diaz", "QA")

# Crear supervisores
supervisor1 = Supervisor("Laura Gutierrez", "Gerente de Proyectos")
supervisor2 = Supervisor("Pedro Morales", "Jefe de Equipo")

# Agregar trabajadores a los supervisores
supervisor1.agregarSubordinado(trabajador1)
supervisor1.agregarSubordinado(trabajador2)
supervisor2.agregarSubordinado(trabajador3)

# Agregar un supervisor a otro supervisor
supervisor1.agregarSubordinado(supervisor2)

# Mostrar detalles de toda la organización
supervisor1.mostrarDetalles()
