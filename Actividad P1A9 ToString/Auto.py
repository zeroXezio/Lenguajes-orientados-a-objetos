class Auto:

    def __init__(self):
        self.__modelo = 0
        self.marca = ""

    @property
    def modelo(self):
        return self.__modelo

    @modelo.setter
    def modelo(self, value):
        self.__modelo = value

#def imprimir(self):
    #	print("\nModelo:", self.__modelo, "\nMarca:", self.marca)

    def __str__(self):
        return f"\nModelo: {self.__modelo} \nMarca: {self.marca}"

#return "\nModelo:", str(self.__modelo), "\nMarca:", self.marca 
#str() es para convertir otros valores a string, tambien puedes usar f de formato para lo mismo 