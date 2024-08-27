from PyQt6.QtWidgets import QWidget, QPushButton, QHBoxLayout



class Vista1(QWidget):

    def __init__(self, controlador):
        super().__init__()
        self.setGeometry(100,100,250,250)
        self.setWindowTitle('ventana 1')
        self.__button = QPushButton("abrir")
        self.__layout = QHBoxLayout()
        self.__button.clicked.connect(controlador.abrirSegunda)
        self.__layout.addWidget(self.__button)
        self.setLayout(self.__layout)
        