import sys
from PyQt6.QtWidgets import QApplication
from controlador.Controlador1 import Controlador1

app = QApplication(sys.argv)
var=Controlador1()
app.exec()