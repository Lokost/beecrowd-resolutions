# coding: utf-8
# Funcional no URI

while True:
    linha = input().split()
    h1 = int(linha[0])
    m1 = int(linha[1])
    h2 = int(linha[2])
    m2 = int(linha[3])
    ht = int(0)

    if h1 == 0:
        h1m = 24 * 60
    if h2 == 0:
        h2m = 24 * 60

    h1m = h1 * 60
    h2m = h2 * 60

    if h1m < h2m:
        ht = h1m + h2m
    elif h1m > h2m:
        ht = (24 - (h1m + h2m))
    else:
        ht = 0

    if m1 < m2:
        mt = m2 - m1
    elif m2 < m1:
        ht -= 60
        mt = (60 - (m1 - m2))
    else:
        mt = 0

    tt = ht + mt

    if tt == 0:
        break
    else:
        print(tt)
