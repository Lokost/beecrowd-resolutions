# coding: UTF-8
# Arquivo: 1103

# Funcional no beecrowd

while True:
    tempos = input().split()
    h1, m1, h2, m2, *_ = [int(x) for x in tempos]

    if h1 + h2 + m1 + m2 == 0:
        break

    elif h1 < 24 and m1 < 60 and h2 < 24 and m2 < 60:

        if h2 > h1:
            TH = h2 - h1
        
        elif h2 < h1:
            TH = 24 - h1 + h2
        else:
            TH = 0

        
        if m2 > m1:
            TM = m2 - m1
        
        elif m2 < m1:
            if TH == 0:
                TH = 23
            else:
                TH -= 1
            TM = 60 - m1 + m2
        
        else:
            if TH == 0:
                TH = 24
            TM = 0

        TM += TH * 60
        print(TM)

# Fim