# coding: utf-8
# Funcional no URI

ver = list(map(int, input().split()))
A = 'I'
N = 0
soma = 0
for i in ver:
    if A == "I":
        A = i

    else:
        if i > 0:
            N = i
            break

for i in range(N):
    soma += A
    A += 1

print('{:d}'.format(soma))
