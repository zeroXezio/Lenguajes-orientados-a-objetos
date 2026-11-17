#Ian Alexander Paz Hernández
#Carrera: TI
#ID: 00603548
from Mamifero import Mamifero

class Gato(Mamifero):
    def __init__(self, n = "", p = 0.0, b = 0):
        super().__init__(n, p)
        
        self.__nBigotes = b
    
    @property
    def nBigotes(self):
        return self.__nBigotes
    
    @nBigotes.setter
    def nBigotes(self, value):
        self.__nBigotes = value
    
    def alimentarse(self):
        print(f"{self.nombre} se alimenta de croquetas y carne")
    
    def emitirSonido(self):
        print(f"{self.nombre} dice: Miau!")