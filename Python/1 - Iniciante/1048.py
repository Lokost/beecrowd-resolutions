# coding: UTF-8
# Funcional no URI

a = float(input())
if 0 <= a <= 400:
    r = (a / 100) * 15
    ns = a + r
    p = 15

elif 400 < a <= 800:
    r = (a / 100) * 12
    ns = a + r
    p = 12

elif 800 < a <= 1200:
    r = (a / 100) * 10
    ns = a + r
    p = 10

elif 1200 < a <= 2000:
    r = (a / 100) * 7
    ns = a + r
    p = 7

elif 2000 < a:
    r = (a / 100) * 4
    ns = a + r
    p = 4

print('Novo salario: {:.2f}\nReajuste ganho: {:.2f}\nEm percentual: {} %'.format(ns, r, p))