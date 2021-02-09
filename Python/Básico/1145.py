# coding: utf-8

[a, b] = input().split()
a = int(a)
b = int(b)
vet = list()
i = 0

while i <= b - a:
    for j in range(1, a + 1):
        i += 1
        p = str(i)
        vet.append(p)
    print(' '.join(vet))
    vet = []
