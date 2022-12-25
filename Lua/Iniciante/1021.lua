-- Funcional no beecrowd
local total = io.read("n")
local notas = total // 1 -- Cópia para troca sem alterar o valor do total
local moedas = (total - notas)* 100

-- Notas
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

-- Moedas
local m1 = notas // 1
local m50 = moedas // 50
moedas = moedas - m50 * 50
local m25 = moedas // 25
moedas = moedas - m25 * 25
local m10 = moedas // 10
moedas = moedas - m10 * 10
local m5 = moedas // 5
moedas = moedas - m5 * 5
local m01 = moedas // 1


print("NOTAS:")
print(string.format("%d nota(s) de R$ 100,00", n100))
print(string.format("%d nota(s) de R$ 50,00", n50))
print(string.format("%d nota(s) de R$ 20,00", n20))
print(string.format("%d nota(s) de R$ 10,00", n10))
print(string.format("%d nota(s) de R$ 5,00", n5))
print(string.format("%d nota(s) de R$ 2,00", n2))
print("MOEDAS:")
print(string.format("%d moeda(s) de R$ 1,00", m1))
print(string.format("%d moeda(s) de R$ 0,50", m50))
print(string.format("%d moeda(s) de R$ 0,25", m25))
print(string.format("%d moeda(s) de R$ 0,10", m10))
print(string.format("%d moeda(s) de R$ 0,05", m5))
print(string.format("%d moeda(s) de R$ 0,01", m01))