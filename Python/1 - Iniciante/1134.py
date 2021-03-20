# coding: UTF-8
# Funcional no URi
al = 0
ga = 0
di = 0

while True:
    t = int(input())

    if t == 1:
        al += 1
    elif t == 2:
        ga += 1
    elif t == 3:
        di += 1
    elif t == 4:
        break

print('MUITO OBRIGADO\nAlcool: {}\nGasolina: {}\nDiesel: {}'.format(al, ga, di))