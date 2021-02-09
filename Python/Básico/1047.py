# Coding: UTF-8

[a, b, c, d] = input().split(' ')
a = int(a)
b = int(b)
c = int(c)
d = int(d)

if a < c:
    h = c - a
    if b < d:
        m = d - b
    elif b > d:
        h -= 1
        m = 60 + (d - b)
    elif b == d:
        m = 0

elif a > c:
    h = 24 + (c - a)
    if b < d:
        m = d - b
    elif b > d:
        h -= 1
        m = 60 + (d - b)
    elif b == d:
        m = 0

elif a == c:
    h = 24
    if b < d:
        m = d - b
    elif b > d:
        h -= 1
        m = 60 + (d - b)
    elif b == d:
        m = 0

print('O JOGO DUROU {} HORA(S) E {} MINUTO(S)'.format(h, m))
