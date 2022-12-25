local n1 = io.read("n")
local n2 = io.read("n")
local n3 = io.read("n")
local n4 = io.read("n")
local media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10
print(string.format("Media: %.1f", media))

if media >= 7 then print("Aluno aprovado.")
elseif media < 5 then print("Aluno reprovado.")
elseif media >= 5 and media < 7 then 
    print("Aluno em exame.")
    local y = io.read("n")
    print(string.format("Nota do exame: %.1f", y))
    local media2 = (media + y) / 2
    if media2 >= 5 then
        print("Aluno aprovado.")
        print(string.format("Media final: %.1f", media2))
    else
        print("Aluno reprovado")
        print(string.format("Media final: %.1f", media2))
    end
end