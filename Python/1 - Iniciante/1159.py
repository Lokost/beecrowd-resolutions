# coding: UTF - 8

while True:
    soma = 0
    r = 0
    x = int(input())
    if x == 0:
        break

    else:
        while True:
            if x % 2 == 0:
                soma += x
                r += 1
            x += 1

            if r == 5:
                break

    print(soma)
