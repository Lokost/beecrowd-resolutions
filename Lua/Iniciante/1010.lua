--[Funcional]

a1 = io.read('n')
b1 = io.read('n')
c1 = io.read('n')
a2 = io.read('n')
b2 = io.read('n')
c2 = io.read('n')

Total = b1 * c1 + b2 * c2

print(string.format('VALOR A PAGAR: R$ %.2f', Total))