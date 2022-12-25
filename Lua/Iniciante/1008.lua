--[Funcional]

local n = io.read('n')
local h = io.read('n')
local s = io.read('n')

local salario = (h * s)
print(string.format('NUMBER = %d',n))
print(string.format('SALARY = U$ %.2f', salario))
