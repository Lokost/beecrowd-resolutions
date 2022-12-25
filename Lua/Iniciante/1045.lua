-- Em revisão!
local A = io.read("n")
local B = io.read("n")
local C = io.read("n")

local pont = B^2 + C^2
local pont2 = A^2
local som = B+C

if A >= som then print("NAO E UM TRIANGULO") end
if pont2 == pont then print("TRIANGULO RETANGULO") end
if pont2 > pont then print("TRIANGULO OBTUSANGULO") end
if pont2 < pont then print("TRANGULO ACUTANGULO") end
if A == B and B == C then print("TRANGULO EQUILATERO") end
if A == B or B == C or C == A then print("TRANGULO ISOSCELES") end
