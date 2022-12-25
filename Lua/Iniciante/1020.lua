-- Funcional no beecrowd
local A = io.read("n")
local anos = A // 365
A = A - anos * 365
local meses = A // 30
A = A - meses * 30
local dias = A

print(string.format("%d ano(s)", anos))
print(string.format("%d mes(es)", meses))
print(string.format("%d dia(s)", dias))