-- Funcional no beecrowd
local A = io.read('n')
local B = io.read('n')
local C = io.read('n')

local D = (A + B + math.abs(A - B)) / 2
local E = (D + C + math.abs(D - C)) / 2

print(string.format("%d eh o maior", E))