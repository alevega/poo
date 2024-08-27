from PyQt6.QtWidgets import QWidget

class Vista2(QWidget):

    def __init__(self):
        super().__init__()
        self.setGeometry(100,100,250,250)
        self.setWindowTitle('ventana 2')
        