# coding: UTF-8
# Funcional no URI

v = []
n = int(input())

for i in range(0, 10):
    v.append(n)
    print("N[{}] = {}".format(i, v[i]))
    n *= 2
