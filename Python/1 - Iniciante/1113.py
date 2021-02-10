while True:
    [a, b] = input().split()
    a = int(a)
    b = int(b)
    if a == b:
        break
    elif a > b:
        print("Decrescente")
    elif a < b:
        print("crescente")
