# coding: utf-8
# Funcional no URI

A = int(input())
mult = 1

if 0 < A < 13:
    while True:
        mult *= A
        A -= 1

        if A < 1:
            break

    print(mult)