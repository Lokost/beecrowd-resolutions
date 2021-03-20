# coding: UTF-8
# Funcional no URI

v = []
for i in range(100):
    x = float(input())
    v.append(x)
    if x <= 10:
        print("A[{}] = {:.1f}".format(i, v[i]))
