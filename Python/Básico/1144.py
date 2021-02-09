# coding: UTF - 8

a = int(input())
mult = 1

for i in range(a):
    i += 1
    j = i ** 2
    mult = i ** 3
    print('{} {} {}'.format(i, j, mult))
    j += 1
    mult += 1
    print('{} {} {}'.format(i, j, mult))