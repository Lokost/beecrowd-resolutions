# coding: UTF - 8

A, B = input().split(" ")
A = int(A)
B = int(B)
if A == 1:
    C = float(B * 4.00)
elif A == 2:
    C = float(B * 4.50)
elif A == 3:
    C = float(B * 5)
elif A == 4:
    C = float(B * 2)
elif A == 5:
    C = float(B * 1.5)

print("Total: R$ {:.2f}".format(C))
