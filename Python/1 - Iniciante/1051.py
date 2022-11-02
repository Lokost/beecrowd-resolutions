# Funcional no beecrowd
# coding: UTF-8
# Arquivo: 1051

sal = float(input())

if 0 <= sal <= 2000:
    print('Isento')
elif sal <= 3000:
    b = (sal - 2000) * .08
    print(f'R$ {b:.2f}')
elif sal <= 4500:
    b = (sal - 3000) * .18 + 80
    print(f'R$ {b:.2f}')
elif sal > 4500:
    b = (sal - 4500) * .28 + 350
    print(f'R$ {b:.2f}')

# Fim