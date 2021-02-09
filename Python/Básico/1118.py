# coding UTF-8
repetir = True
confirm = False
while repetir:
    pos = int(0)
    som = float(0)
    while pos != 2:
        a = float(input())
        if 0 <= a <= 10:
            som += a
            pos += 1
        else:
            print('nova invalida')
    print('media = {:.2f}'.format(som / 2))

    while True:
        print('novo calculo (1-sim 2-nao)')
        b = int(input())
        if b == 2:
            repetir = False
            break
        elif b == 1:
            repetir = True
            break