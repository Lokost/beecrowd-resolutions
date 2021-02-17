# coding: UTF-8
# Funcional no URI

N = int(input())
for i in range(N):
    soma = int(0)
    x = input().split()
    [a, b] = x
    a = int(a)
    b = int(b)
    if a > b:
        e = a - b
    elif a < b:
        e = b - a
    elif a == b:
        e = 0

    for j in range(e - 1):
        if a > b:
            b += 1
            if b % 2 == 1:
                soma += b
        else:
            a += 1
            if a % 2 == 1:
                soma += a

    print(soma)
