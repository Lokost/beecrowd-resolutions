-- Funcional no beecrowd!
local A = io.read("n")
local B = io.read("n")
local C = io.read("n")

local maior = 0
local menor = 0
local medio = 0

if A > B then
    maior = A
    menor = B
else
    maior = B
    menor = A
end

if C > maior then
    medio = maior
    maior = C
elseif C < menor then
    medio = menor
    menor = C
else
    medio = C
end

print(menor)
print(medio)
print(maior)
print("")
print(A)
print(B)
print(C)
