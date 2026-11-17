#Ian Alexander Paz Hernández
#Carrera: TI
#ID: 00603548
from Mamifero import Mamifero

class Vaca(Mamifero):
    def __init__(self, n = "", p = 0.0, l = 0):
        super().__init__(n, p)
        
        self.__litrosDeLeche = l
    
    @property
    def litrosDeLeche(self):
        return self.__litrosDeLeche
    
    @litrosDeLeche.setter
    def litrosDeLeche(self, value):
        self.__litrosDeLeche = value
    
    def alimentarse(self):
        print(f"{self.nombre} se alimenta de pasto y heno")
    
    def emitirSonido(self):
        print(f"{self.nombre} dice: Muuu!")