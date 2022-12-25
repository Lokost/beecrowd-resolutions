-- Funcional no beecrowd
local A = io.read("n")
local B = io.read("n")
local C = 0

if A == 1 then C = B * 4
elseif A == 2 then C = B * 4.5
elseif A == 3 then C = B * 5
elseif A == 4 then C = B * 2
elseif A == 5 then C = B * 1.5
end

print(string.format("Total: R$ %.2f", C))