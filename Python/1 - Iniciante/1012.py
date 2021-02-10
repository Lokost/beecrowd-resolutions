# coding: UTF - 8

A, B, C = input().split(" ")
A = float(A)
B = float(B)
C = float(C)

D = float((A * C) / 2)
E = float(3.14159 * (C * C))
F = float(((A + B) * C) / 2)
G = float(B * B)
H = float(A * B)

print("TRIANGULO: %.3f" % D)
print("CIRCULO: %.3f" % E)
print("TRAPEZIO: %.3f" % F)
print("QUADRADO: %.3f" % G)
print("RETANGULO: %.3f" % H)
