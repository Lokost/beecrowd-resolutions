# coding: UTF-8
# Funcional no URI

V = []
for i in range(0, 10):
    V.append(int(input()))
    if V[i] <= 0:
        V[i] = 1
    print("X[%d] = %d" % (i, V[i]))
