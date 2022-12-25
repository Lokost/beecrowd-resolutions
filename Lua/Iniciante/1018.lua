-- Funcional no beecrowd
local total = io.read("n")
local notas = total / 1 -- Cópia para troca sem alterar o valor do total

local n100 = notas // 100
notas = notas - n100 * 100
local n50 = notas // 50
notas = notas - n50 * 50
local n20 = notas // 20
notas = notas - n20 * 20
local n10 = notas // 10
notas = notas - n10 * 10
local n5 = notas // 5
notas = notas - n5 * 5
local n2 = notas // 2
notas = notas - n2 * 2
local n1 = notas // 1

print(total)
print(string.format("%d nota(s) de R$ 100,00", n100))
print(string.format("%d nota(s) de R$ 50,00", n50))
print(string.format("%d nota(s) de R$ 20,00", n20))
print(string.format("%d nota(s) de R$ 10,00", n10))
print(string.format("%d nota(s) de R$ 5,00", n5))
print(string.format("%d nota(s) de R$ 2,00", n2))
print(string.format("%d nota(s) de R$ 1,00", n1))