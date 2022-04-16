nome = io.read('l')
s = io.read('n')
m = io.read('n')

nsalario = s + (m / 100) * 15

print(string.format('TOTAL = R$ %.2f', nsalario))