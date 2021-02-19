# coding: UTF-8
# Funcional no URI

X = int(input())
Z = int(input())
soma = X
q = 1
a = X

while Z <= X:
    Z = int(input())

while soma <= Z:
    a += 1
    soma += a
    q += 1

print('{:d}'.format(q))
