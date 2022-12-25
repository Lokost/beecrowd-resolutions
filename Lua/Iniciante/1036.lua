-- Funcional no beecrowd
local A = io.read("n")
local B = io.read("n")
local C = io.read("n")

local D = (B^2) - 4 * A * C

if D < 0 or A == 0 then
    print("Impossivel calcular")
else
    R1 = (-B + math.sqrt(D)) / (2 * A)
    R2 = (-B - math.sqrt(D)) / (2 * A)
    print(string.format("R1 = %.5f", R1))
    print(string.format("R2 = %.5f", R2))
end