# coding: UTF-8

O = input()
M = []
soma = 0.0
media = 0.0
C = 0

for i in range(12):
    M.append([])
    for j in range(12):
        M[i].append(float(input()))

for k in range(len(M[0])):
    for l in range(C, len(M[0])):
        soma += M[k][l]
    C += 1

media = soma / len(M[0])

if O == 'S':
    print(soma)
if O == 'M':
    print('%.1f' % media)

# Fim
