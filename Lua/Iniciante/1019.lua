-- Funcional no beecrowd
local A = io.read("n")
local h = A // 3600
A = A - h * 3600
local m = A // 60
A = A - m * 60
local s = A

print(string.format("%d:%d:%d", h, m, s))