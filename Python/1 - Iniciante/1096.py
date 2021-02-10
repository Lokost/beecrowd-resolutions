# coding: UTF-8

i = int(1)
while i != 11:
    j = 7
    print('I={} J={}'.format(i, j))
    for a in range(2):
        j -= 1
        print('I={} J={}'.format(i, j))
    i += 2
