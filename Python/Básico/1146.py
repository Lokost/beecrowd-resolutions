while True:
    a = int(input())
    if a > 0:
        i = 0
        vet = []
        while i < a:
            i += 1
            p = str(i)
            vet.append(p)

        print(' '.join(vet))
        vet = []

    else:
        break