# coding: UTF - 8
# Funcional no URI

import math


numeros = input().split(" ")
A = float(numeros[0])
B = float(numeros[1])
C = float(numeros[2])

D = (B ** 2) - 4 * A * C

if D < 0 or A == 0:
    print("Impossivel calcular")
else:
    R1 = (-B + math.sqrt(D)) / (2 * A)
    R2 = (-B - math.sqrt(D)) / (2 * A)
    print(f"R1 = {R1:.5f}")
    print(f"R2 = {R2:.5f}")
