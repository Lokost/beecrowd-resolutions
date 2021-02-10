# coding: UTF - 8

A, B, C = input().split(" ")
A = float(A)
B = float(B)
C = float(C)

D = ((A + B + abs(A-B))/2)
E = ((D + C + abs(D-C))/2)

print("%d eh o maior" % E)