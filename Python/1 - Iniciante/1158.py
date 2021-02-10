# coding: UTF - 8

A = int(input())

for i in range(A):
    [b, c] = input().split()
    b = int(b)
    c = int(c)
    d = b
    e = 0
    soma = 0

    while True:
        if d % 2 == 1:
            soma += d
            e += 1
        d += 1

        if e == c:
            break

    print(soma)
