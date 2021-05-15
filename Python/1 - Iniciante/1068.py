#coding: UTF-8
# Funcional no URI

while True:
    try:
        N = input()
        p = 0

        for i in N:
            if i == "(":
                p += 1
            elif i == ")":
                p -= 1
            if p < 0:
                break

        if p != 0:
            print("incorrect")
        else:
            print("correct")

    except EOFError:
        break
#Fim
