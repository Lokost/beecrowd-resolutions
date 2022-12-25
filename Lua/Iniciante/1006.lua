--[Funcional]
local a = io.read('n')
local b = io.read('n')
local c = io.read('n')

local media = (a * 2 + b * 3 + c * 5) / 10

print(string.format('MEDIA = %.1f', media))