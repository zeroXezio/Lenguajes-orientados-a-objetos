# Ian Alexander Paz Hernández
# Carrera: TI
# 00603548

class Empleado:
    def __init__(self):
        self.primerNombre = ""
        self.apellidoPaterno = ""
        self.salarioMensual = 0.0
        
    def obtenerSalarioAnual(self):
        return self.salarioMensual * 12

# EmpleadoTest
emp1 = Empleado()

emp1.primerNombre = input("Primer nombre del empleado 1: ")
emp1.apellidoPaterno = input("Apellido paterno del empleado 1: ")
emp1.salarioMensual = float(input("Salario mensual del empleado 1: "))

if emp1.salarioMensual < 0.0:
    emp1.salarioMensual = 0.0
    
emp2 = Empleado()

emp2.primerNombre = input("Primer nombre del empleado 2: ")
emp2.apellidoPaterno = input("Apellido paterno del empleado 2: ")
emp2.salarioMensual = float(input("Salario mensual del empleado 2: "))

if emp2.salarioMensual < 0.0:
    emp2.salarioMensual = 0.0
    
print("\n---------------- SALARIOS ANUALES INICIALES ----------------")
print(f"{emp1.primerNombre} {emp1.apellidoPaterno}: ${emp1.obtenerSalarioAnual()}")
print(f"{emp2.primerNombre} {emp2.apellidoPaterno}: ${emp2.obtenerSalarioAnual()}")

emp1.salarioMensual *= 1.10
emp2.salarioMensual *= 1.10

print("\n---------------- SALARIOS ANUALES FINALES ----------------")
print(f"{emp1.primerNombre} {emp1.apellidoPaterno}: ${emp1.obtenerSalarioAnual()}")
print(f"{emp2.primerNombre} {emp2.apellidoPaterno}: ${emp2.obtenerSalarioAnual()}")