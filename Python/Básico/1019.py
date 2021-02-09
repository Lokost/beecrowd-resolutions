# coding: UTF - 8

A = int(input())
h = int(A / 3600)
A -= h * 3600
m = int(A / 60)
A -= m * 60
s = A

print("%d:%d:%d" % (h, m, s))
