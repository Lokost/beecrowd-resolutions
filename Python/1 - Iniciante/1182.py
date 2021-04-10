# coding: UTF-8
# Funcional no URI

L = int(input())
T = input()
M = []
soma = float()
media = float()

for i in range(12):
    M.append([])
    for j in range(12):
        M[i].append(float(input()))

if T == 'S':
    for k in range(12):
        soma += M[L][k]
    print(soma)

elif T == 'M':
    for k in range(len(M[0])):
        soma += M[k][L]
    media = soma / len(M[0])
    print('%.1f' % media)

# Fim
