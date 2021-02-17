# coding: utf-8
# Funcional no URI

A = float(input())
T = int(A)
Tm = int((A - T) * 100)

n100 = int(T / 100)
T -= n100 * 100
n50 = int(T / 50)
T -= n50 * 50
n20 = int(T / 20)
T -= n20 * 20
n10 = int(T / 10)
T -= n10 * 10
n5 = int(T / 5)
T -= n5 * 5
n2 = int(T / 2)
T -= n2 * 2
m1 = int(T)


m05 = int(Tm / 50)
Tm -= m05 * 50
m025 = int(Tm / 25)
Tm -= m025 * 25
m010 = int(Tm / 10)
Tm -= m010 * 10
m005 = int(Tm / 5)
Tm -= m005 * 5
m001 = int(Tm)
Tm -= m001

print('''NOTAS:
{} nota(s) de R$ 100.00
{} nota(s) de R$ 50.00
{} nota(s) de R$ 20.00
{} nota(s) de R$ 10.00
{} nota(s) de R$ 5.00
{} nota(s) de R$ 2.00
MOEDAS:
{} moeda(s) de R$ 1.00
{} moeda(s) de R$ 0.50
{} moeda(s) de R$ 0.25
{} moeda(s) de R$ 0.10
{} moeda(s) de R$ 0.05
{} moeda(s) de R$ 0.01'''.format(n100, n50, n20, n10, n5, n2, m1, m05, m025, m010, m005, m001))
