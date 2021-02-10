# coding: UTF - 8

a = int(input())
b = int(input())

if a > b:
    maior = a
    menor = b + 1
else:
    maior = b
    menor = a + 1

while menor < maior:
    if menor % 5 == 2 or menor % 5 == 3:
        print(menor)
    menor += 1
