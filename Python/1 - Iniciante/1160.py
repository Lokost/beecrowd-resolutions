# coding: UTF - 8

T = int(input())

for i in range (T):
    [pa, pb, g1, g2] = input().split()
    pa = int(pa)
    pb = int(pb)
    g1 = float(g1)
    g2 = float(g2)
    a = 0

    while pa <= pb:
        pa = int(pa + ((pa / 100) * g1))
        pb = int(pb + ((pb / 100) * g2))
        a += 1

        if a > 100:
            break

    if a <= 100:
        print('{} anos.'.format(a))

    else:
        print('Mais de 1 seculo.')
