# coding: UTF - 8

A = int(input())
B = int(A)
n100 = int(B/100)
B -= n100 * 100
n50 = int(B / 50)
B -= n50 * 50
n20 = int(B / 20)
B -= n20 * 20
n10 = int(B / 10)
B -= n10 * 10
n5 = int(B / 5)
B -= n5 * 5
n2 = int(B / 2)
B -= n2 * 2
n1 = B

print(A)
print("%d nota(s) de R$ 100,00" % n100)
print("%d nota(s) de R$ 50,00" % n50)
print("%d nota(s) de R$ 20,00" % n20)
print("%d nota(s) de R$ 10,00" % n10)
print("%d nota(s) de R$ 5,00" % n5)
print("%d nota(s) de R$ 2,00" % n2)
print("%d nota(s) de R$ 1,00"% n1)
