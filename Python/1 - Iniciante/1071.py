# Funcional no beecrowd
# coding: UTF-8
# Arquivo: 1071

x = int(input())
y = int(input())
soma = 0

if x > y:
    a = x 
    b = y + 1
else:
    a = y
    b = x + 1

while a > b:
    if b %2 == 1:
        soma += b
    b += 1

print(soma)

# Fim