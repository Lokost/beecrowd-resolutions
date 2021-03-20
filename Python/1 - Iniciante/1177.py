# coding: UTF-8

T = int(input())
S = int(0)
V = []

for i in range(1000):
    if S >= T:
        S = 0
        V.append(S)
        S += 1
    else:
        V.append(S)
        S += 1
    print("N[{}] = {}".format(i, V[i]))
