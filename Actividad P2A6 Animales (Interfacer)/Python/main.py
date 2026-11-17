#Ian Alexander Paz Hernández
#Carrera: TI
#ID: 00603548
from Gato import Gato
from Vaca import Vaca
from Ballena import Ballena
from ISonido import ISonido
from Mamifero import Mamifero


miGato = Gato("Tamal", 5.37, 36)
miVaca = Vaca("Clarabella", 900.0, 25.5)
miBallena = Ballena("Preciosa", 340000.0)
    
print(f"Nombre: {miGato.nombre}\nPeso: {miGato.peso}kg\nNumero de Bigotes: {miGato.nBigotes}")
miGato.comer()
miGato.comer("Pescado")
miGato.comer("Croquetas", 2)
miGato.alimentarse()
miGato.emitirSonido()

print()

print(f"Nombre: {miVaca.nombre}\nPeso: {miVaca.peso}kg\nLeche Producida al dia: {miVaca.litrosDeLeche}l")
miVaca.comer()
miVaca.comer("Pasto")
miVaca.comer("Heno", 2)
miVaca.alimentarse()
miVaca.emitirSonido()

print()

print(f"Nombre: {miBallena.nombre}\nPeso: {miBallena.peso}kg")
miBallena.comer()
miBallena.comer("Plancton")
miBallena.comer("Krill", 2)
miBallena.alimentarse()
miBallena.emitirSonido()