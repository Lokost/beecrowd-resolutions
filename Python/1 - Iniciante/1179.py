# coding: UTF-8

par = []
imp = []

for i in range(15):
    x = int(input())
    if x % 2 == 0:
        par.append(x)
    else:
        imp.append(x)

    if len(par) == 5:
        for j in range(len(par)):
            print('par[{}] = {}'.format(j, par[j]))
        par = []

    elif len(imp) == 5:
        for j in range(len(imp)):
            print('impar[{}] = {}'.format(j, imp[j]))
        imp = []

for k in range(len(imp)):
    print('impar[{}] = {}'.format(k, imp[k]))

for k in range(len(par)):
    print('par[{}] = {}'.format(k, par[k]))

# Fim
