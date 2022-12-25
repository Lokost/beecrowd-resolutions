-- Funcional no beecrowd
local A = io.read("n")
local B = io.read("n")
local C = io.read("n")
local D = io.read("n")

local AB = A + B
local CD = C + D

if B > C and D > A and AB < CD and C > 0 and D > 0 and A %2 == 0 then
    print("Valores aceitos")
else
    print("Valores nao aceitos")
end