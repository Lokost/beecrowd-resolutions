# coding: UTF-8
# Funcional no URI

i = int(1)
j = int(7)
while i != 11:
    print('I={} J={}'.format(i, j))
    for a in range(2):
        j -= 1
        print('I={} J={}'.format(i, j))
    i += 2
    j += 4
