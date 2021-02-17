# coding: UTF - 8
# wrong answer

a = int(input())

if 20 >= a > 0:
    for i in range(a):
        b = int(input())
        soma = 0
        a2 = 1
        while soma < b:
            if soma < b:
                soma += a2
                a2 += 1

        if soma == b:
            print('{} eh perfeito'.format(b))
        else:
            print('{} nao eh perfeito'.format(b))
