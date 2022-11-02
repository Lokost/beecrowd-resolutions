# Em revisão!
# coding: UTF-8
# Arquivo: 1051

sal = float(input())

if 0 <= sal <= 2000:
    print('Isento')
elif sal <= 3000:
    c = sal - 2000
    b = c * 0.08
    print(f'R$ {b:.2f}')
elif sal <= 4500:
    b = 1000 * 0.8
    c = sal - 3000
    b += c * 0.18
    print(f'R$ {b:.2f}')
elif sal > 4500:
    b = 1000 * 0.8 + 1500 * .18
    c = sal - 4500
    b += c * 0.18
    print(f'R$ {b:.2f}')

# Fim