# Em revisão!
# coding: UTF-8
# Arquivo: 1184

from random import randint

Op = input()
matriz = [[float(input()) for j in range(12)] for x in range(12)]

soma = 0.0
num = 0

for n, i in enumerate(matriz):
    for j in i[-(n+1):]:
        soma += j
        num += 1

if Op == 'S':
    print(f'{soma:.1f}')
elif Op == 'M':
    print(f'{soma / num:.1f}')

# Fim