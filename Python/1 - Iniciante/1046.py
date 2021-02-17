# coding: UTF - 8
# Funcional no URI

A, B = input().split()
A = int(A)
B = int(B)
H = 0

if A >= 0 <= B <= 24 >= A:
    if A > B:
        H = int(24 - A + B)
    elif A < B:
        H = int(B - A)
    elif A == B:
        H = int(24)

print("O JOGO DUROU {:d} HORA(S)".format(H))
