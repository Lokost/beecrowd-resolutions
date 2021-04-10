# coding: UTF-8

N = int(input())
X = input()
X = X.split()
menor = 0
posicao = 0

for i in range(len(X)):
    X[i] = int(X[i])

menor = X[0]
for j in range(len(X)):
    if X[j] < menor:
        menor = X[j]
        posicao = j

print('Menor valor: {}\nPosicao: {}\n'.format(menor, posicao))
# Fim
