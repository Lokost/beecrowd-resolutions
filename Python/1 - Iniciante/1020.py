# coding: UTF - 8
# Funcional no URI

A = int(input())
h = int(A / 365)
A -= h * 365
m = int(A / 30)
A -= m * 30
s = A

print("%d ano(s)" %(h))
print("%d mes(es)" %(m))
print("%d dia(s)" %(s))