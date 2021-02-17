# coding: UTF-8
# Wrong Answer

X = int(input())
Z = int(input())
soma = X
q = 1
a = 0

while Z <= X:
    Z = int(input())
    if Z > a:
        soma += a
        q += 1
        a = Z

soma += q
print('{:d}'.format(soma))
