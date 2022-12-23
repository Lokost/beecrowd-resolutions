# coding: UTF-8
# Arquivo: 1117

# Funcional no beecrowd

i = 1
soma = 0
while i <= 2:
    n = float(input())
    if n >= 0 and n <= 10:
        soma += n
        i += 1
    else:
        print("nota invalida")

media = soma / 2
print(f"media = {media:.2f}")
# Fim