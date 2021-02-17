# coding: UTF-8
# Funcional no URI

coelhos = int(0)
ratos = int(0)
sapos = int(0)
soma = int(0)

N = int(input())

for i in range(N):
    x = input().split()
    [a, b] = x
    a = int(a)
    if b == 'C':
        coelhos += a
    elif b == 'R':
        ratos += a
    elif b == 'S':
        sapos += a
    soma += a

percen = float(100 / soma)
p_coelho = float(percen * coelhos)
p_rato = float(percen * ratos)
p_sapo = float(percen * sapos)

print("""Total: {} cobaias
Total de coelhos: {}
Total de ratos: {}
Total de sapos: {}
Percentual de coelhos: {:.2f} %
Percentual de ratos: {:.2f} %
Percentual de sapos: {:.2f} %""".format(soma, coelhos, ratos, sapos, p_coelho, p_rato, p_sapo))
