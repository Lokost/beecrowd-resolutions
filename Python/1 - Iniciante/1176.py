# coding: UTF-8
# Funcional no URI

F = [0, 1]
for P in range(1, 61):
    F.append(int(F[P]) + int(F[P - 1]))

T = int(input())

for i in range(1, T + 1):
    N = int(input())
    print("Fib({}) = {}".format(N, F[N]))