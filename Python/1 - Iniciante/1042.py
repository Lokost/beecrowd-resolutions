# coding: UTF - 8
# Funcional no URI

A, B, C = input().split(" ")
A = int(A)
B = int(B)
C = int(C)
if A < B < C and A < C:
    print(A)
    print(B)
    print(C)
elif A < B and A < C < B:
    print(A)
    print(C)
    print(B)
elif B < A < C and B < C:
    print(B)
    print(A)
    print(C)
elif B < A and B < C < A:
    print(B)
    print(C)
    print(A)
elif C < B and C < A < B:
    print(C)
    print(A)
    print(B)
else:
    print(C)
    print(B)
    print(A)

print("")
print(A)
print(B)
print(C)