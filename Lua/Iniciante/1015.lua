-- Funcional no beecrowd

local A = io.read("n")
local B = io.read("n")
local C = io.read("n")
local D = io.read("n")

local E = math.sqrt((C - A)^2 + (D - B)^2)
print(string.format("%.4f", E))