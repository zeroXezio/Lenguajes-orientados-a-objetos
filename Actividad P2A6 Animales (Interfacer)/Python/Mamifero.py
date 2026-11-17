#Ian Alexander Paz Hernández
#Carrera: TI
#ID: 00603548
from abc import ABC, abstractmethod
from ISonido import ISonido

class Mamifero(ISonido, ABC):
    def __init__(self, n = "", p = 0.0):
        self.__nombre = n
        self.__peso = p

    @property
    def nombre(self):
        return self.__nombre
    
    @nombre.setter
    def nombre(self, value):
        self.__nombre = value
    
    @property
    def peso(self):
        return self.__peso
    
    @peso.setter
    def peso(self, value):
        self.__peso = value
    
    def comer(self, comida = None, cantidad = None):
        if comida is None and cantidad is None:
            print(f"{self.__nombre} esta comiendo")
        elif cantidad is None:
            print(f"{self.__nombre} esta comiendo {comida}")
        else:
            print(f"{self.__nombre} esta comiendo {cantidad} porciones de {comida}")
    
    @abstractmethod
    def alimentarse(self):
        pass