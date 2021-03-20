# coding: UTF-8
# Funcional no URI

X = []
N = []

for i in range(20):
    X.append(int(input()))

k = len(X) - 1
for j in range(20):
    N.append(X[k])
    k -= 1
    print("N[{}] = {}".format(j, N[j]))
