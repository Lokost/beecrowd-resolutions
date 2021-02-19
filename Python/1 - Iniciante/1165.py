# coding: UTF - 8
# Funcional no URI

a = int(input())

for i in range(a):
    num = int(input())
    s = 0
    j = 1
    while j <= num:
        if num % j == 0:
            s += 1
        j += 1

    if s > 2:
        print('{} nao eh primo'.format(num))
    else:
        print('{} eh primo'.format(num))