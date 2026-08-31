# Ian Alexander Paz Hernández
# Carrera: TI
# 00603548

class Fecha:
    def __init__(self, mes=0, dia=0, anio=0):
        self.unMes = mes
        self.unDia = dia
        self.unAnio = anio
        
    def mostrarFecha(self):
        return f"{self.unMes}/{self.unDia}/{self.unAnio}"

# FechaTest
fechaActual = Fecha()

print("Ingrese los siguientes valores en numeros")
fechaActual.unDia = int(input("Que dia es hoy: "))
fechaActual.unMes = int(input("En que mes estamos: "))
fechaActual.unAnio = int(input("En que anio estamos: "))

print("\n---------------- FECHA ACTUAL ----------------")
print(fechaActual.mostrarFecha())