# Ian Alexander Paz Hernández
# Carrera: TI
# 00603548

class Factura:
    def __init__(self, num_piezas, descripcion, cantidad, precio):
        self.num_piezas = num_piezas
        self.descripcion = descripcion
        self.cantidad = cantidad if cantidad > 0 else 0
        self.precio = precio if precio > 0.0 else 0.0

    def obtenerMontoFactura(self):
        return self.cantidad * self.precio

# FacturaTest
num_piezas = input("Ingresa el numero de piezas: ")
descripcion = input("Descripcion: ")
cantidad = int(input("Cantidad: "))
precio = float(input("Precio: "))

ferre = Factura(num_piezas, descripcion, cantidad, precio)

print("----------------------------------------")
print("Numero de pieza:", ferre.num_piezas)
print("Descripcion:", ferre.descripcion)
print("Cantidad:", ferre.cantidad)
print("Precio unitario:", ferre.precio)
print("Factura:", ferre.obtenerMontoFactura())