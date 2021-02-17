# coding: UTF-8
# Funcional no URI

retorno = True
gremio = int(0)
inter = int(0)
empate = int(0)
grenais = 1

while retorno:
    [a , b] = input().split()
    a = int(a)
    b = int(b)

    if a > b:
        inter += 1
    elif a < b:
        gremio += 1
    elif a == b:
        empate += 1

    while True:
        print('Novo grenal (1-sim 2-nao)')
        b = int(input())
        if b == 1:
            grenais += 1
            break
        elif b == 2:
            retorno = False
            break

if inter > gremio:
    vencedor = 'Inter venceu mais'
elif inter < gremio:
    vencedor = 'Gremio venceu mais'
else:
    vencedor = 'Nao houve vencedor'


print('{} grenais\nInter:{}\nGremio:{}\nEmpates:{}\n{}'.format(grenais, inter, gremio, empate, vencedor))
