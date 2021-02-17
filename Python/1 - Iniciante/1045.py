# coding: utf-8
# Funcional no URI

a, b, c, = input().split(' ')
a = float(a)
b = float(b)
c = float(c)

pont = b**2 + c ** 2
pont2 = a**2
som = b+c

if a >= som:
    print('NAO E UM TRIANGULO')
elif pont2 == pont:
    print('TRIANGULO RETANGULO')
elif pont2 > pont:
    print('TRIANGULO OBTUSANGULO')
elif pont2 < pont:
    print('TRIANGULO ACUTANGULO')
elif a == b and b == c:
    print('TRIANGULO EQUILATERO')
elif a == b or b == c or c == a:
    print('TRIANGULO ISOSCELES')
