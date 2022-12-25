-- Funcional no beecrowd
local A = io.read("n")

if 0 <= A and A <= 25 then
    print("Intervalo [0,25]")
elseif 25 < A and A <= 50 then
    print("Intervalo (25,50]")
elseif 50 < A and A <= 75 then
    print("Intervalo (50,75]")
elseif 75 < A and A <= 100 then
    print("Intervalo (75,100]")
else
    print("Fora de intervalo")
end