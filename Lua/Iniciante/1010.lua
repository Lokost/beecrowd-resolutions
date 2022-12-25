--[Funcional]

local a1 = io.read('n')
local b1 = io.read('n')
local c1 = io.read('n')
local a2 = io.read('n')
local b2 = io.read('n')
local c2 = io.read('n')

local Total = b1 * c1 + b2 * c2

print(string.format('VALOR A PAGAR: R$ %.2f', Total))