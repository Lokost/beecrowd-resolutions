# coding: UTF - 8

[a, b, c] = input().split()
[d, e, f] = input().split()
b = int(b)
c = float(c)
e = int(e)
f = float(f)

t = (b * c) + (e * f)

print('VALOR A PAGAR: R$ {:.2f}'.format(t))
