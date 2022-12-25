-- Funcional no beecrowd!
local x = io.read("n")
local y = io.read("n")

if x == 0 and 0 ~= y then
    print("Eixo Y")
elseif y == 0 and 0 ~= x then
    print("Eixo X")
elseif x > 0 and 0 < y then
    print("Q1")
elseif x < 0 and 0 < y then
    print("Q2")
elseif x < 0 and 0 > y then
    print("Q3")
elseif x > 0 and 0 > y then
    print("Q4")
else
    print("Origem")
end