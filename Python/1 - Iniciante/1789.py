# Arquivo: 1789.py
# por: gabri
# coding: UTF-8
# Em revisão

while True:
    N = int(input())
    L = []
    maior = 0

    for i in range(N):
        L.append(int(input()))

    for i in range(1, len(L)):
        if L[i] > L[i - 1]:
            maior = L[i]

        else:
            maior = L[i-1]

    if maior < 10:
        print("1")
    elif 10 <= maior < 20:
        print("2")
    else:
        print("3")

# Fim
