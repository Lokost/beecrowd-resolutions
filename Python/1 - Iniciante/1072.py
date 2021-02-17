# coding UTF-8
# Funcional no URI

N = int(input())
dentro = int(0)
fora = int(0)
for i in range(1, N+1):
    X = int(input())
    if 10 <= X <= 20:
        dentro += 1
    else:
        fora += 1
print('{} in'.format(dentro))
print('{} out'.format(fora))
