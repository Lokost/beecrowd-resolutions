# coding: UTF-8
#Funcional no URI

Op = input()
M = list()
soma = 0.0
n = 1
num = 0

for i in range(12):
    M.append([])
    for j in range(12):
        M[i].append(float(input()))

for i in range(0, 11):
    for j in range(n, 12):
        soma += M[i][j]
        num += 1
    n += 1

if Op == 'S':
    print("%.1f" % soma)

elif Op == "M":
    print("%.1f" % (soma / num))

# Fim
