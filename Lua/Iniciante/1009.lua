local nome = io.read('l')
local s = io.read('n')
local m = io.read('n')

local nsalario = s + (m / 100) * 15

print(string.format('TOTAL = R$ %.2f', nsalario))