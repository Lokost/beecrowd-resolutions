-- Funcional no beecrowd
local A = io.read('n')
local B = io.read('n')
local C = io.read('n')

local triangulo = (A * C) / 2
local circulo = 3.14159 * (C * C)
local trapezio = ((A + B) * C) / 2
local quadrado = B ^ 2
local retangulo = A * B

print(string.format("TRIANGULO: %.3f", triangulo))
print(string.format("CIRCULO: %.3f", circulo))
print(string.format("TRAPEZIO: %.3f", trapezio))
print(string.format("QUADRADO: %.3f", quadrado))
print(string.format("RETANGULO: %.3f", retangulo))