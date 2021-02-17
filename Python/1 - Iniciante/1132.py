# coding: UTF-8
# Funcional no URI

a = int(input())
b = int(input())
soma = int(0)
if a > b:
    ran = a - b
    menor = b - 1
    maior = a
else:
    ran = b - a
    menor = a - 1
    maior = b

while menor < maior:
    menor += 1
    if menor % 13 != 0:
        soma += menor

print(soma)