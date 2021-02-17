# coding: utf-8
# Funcional no URI

soma = 0
cont = 0

while True:
    A = int(input())
    if A >= 0:
        soma += A
        cont += 1

    else:
        print('{:.2f}'.format(float(soma / cont)))
        break
