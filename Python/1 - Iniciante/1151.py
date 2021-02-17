# coding: UTF-8
# Funcional no URI

vet = ['0', '1']
N = int(input())
i = 1
while True:
    if 0 < N < 46:
        while i != N - 1:
            a = int(vet[i]) + int(vet[i - 1])
            b = str(a)
            vet.append(b)
            i += 1
        break
    else:
        break

print(' '.join(vet))
