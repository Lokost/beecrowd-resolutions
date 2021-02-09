# coding: UTF-8

a = int(input())
for i in range(a):
    [a, b, c] = input().split()
    a = float(a)
    b = float(b)
    c = float(c)
    media = float((a * 2 + b * 3 + c * 5) / 10)
    print('{:.1f}'.format(media))
