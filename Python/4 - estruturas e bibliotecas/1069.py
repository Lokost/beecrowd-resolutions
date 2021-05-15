# coding: UTF-8
# funcional no URI

V = int(input())
for i in range(V):
    a = input()
    ab = 0
    diamantes = 0

    for j in a:
        if j == "<":
            ab += 1
        
        if j == ">" and ab != 0:
            diamantes += 1
            ab -= 1
    
    print(diamantes)

# Fim
