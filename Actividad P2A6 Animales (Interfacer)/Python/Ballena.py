#Ian Alexander Paz Hernández
#Carrera: TI
#ID: 00603548
from Mamifero import Mamifero

class Ballena(Mamifero):
    def __init__(self, n = "", p = 0.0):
        super().__init__(n, p)
    
    def alimentarse(self):
        print(f"{self.nombre} se alimenta de plancton y krill")
    
    def emitirSonido(self):
        print(f"{self.nombre} emite un canto de ballena")