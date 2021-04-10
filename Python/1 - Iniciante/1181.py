# coding: UTF-8
# from random import randint
# funcional no URI

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
        soma += M[L][k]
    media = soma / len(M[0])
    print(media)

# for l in range(12):
#     print('Linha {}: {}'.format(l, M[l]))

# Fim
