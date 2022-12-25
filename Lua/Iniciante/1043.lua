-- Funcional no beecrowd!
local A = io.read("n")
local B = io.read("n")
local C = io.read("n")

local AB = A + B
local BC = B + C
local AC = A + C

if math.abs(B - C) < A and A < BC and (A - C) < B and B < AC and (A - B) < C and C < AB then
    print(string.format("Perimetro = %.1f", (A + B + C)))
else
    print(string.format("Area = %.1f", (AB / 2) * C))
end