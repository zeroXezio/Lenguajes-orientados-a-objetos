#Ian Alexander Paz Hernández
#Carrera: TI
#ID: 00603548
from abc import ABC, abstractmethod

class ISonido(ABC):
    @abstractmethod
    def emitirSonido(self):
        pass