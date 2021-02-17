# coding UTF-8
# Funcional no URI

a = int(input())
for i in range(a):
    x = int(input())
    if x < 0:
        e = 'NEGATIVE'
    elif x == 0:
        print('NULL')
    elif x > 0:
        e = 'POSITIVE'

    if x % 2 == 0:
        f = 'EVEN'
    else:
        f = 'ODD'

    if x != 0:
        print('{} {}'.format(f, e))
