# coding: UTF - 8
# Funcional no URI

import math
A, B = input().split(" ")
C, D = input().split(" ")
A = float(A)
B = float(B)
C = float(C)
D = float(D)
E = float(math.sqrt(((C - A) * (C - A)) + ((D - B) * (D - B))))
print("%.4f" % E)
