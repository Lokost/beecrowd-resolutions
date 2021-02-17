# coding: utf-8
# Funcional no URI

d1 = input().split()
h1 = input().split()
d2 = input().split()
h2 = input().split()

dc = [int(d1[1]), int(h1[0]), int(h1[2]), int(h1[4])]
df = [int(d2[1]), int(h2[0]), int(h2[2]), int(h2[4])]

min_seg = 60
hor_seg = min_seg * 60
dia_seg = hor_seg * 24

i = dc[3] + dc[2] * min_seg + dc[1] * hor_seg + dc[0] * dia_seg
f = df[3] + df[2] * min_seg + df[1] * hor_seg + df[0] * dia_seg

if i < f:
    T = f - i
    d = int(T/dia_seg)
    T = T % dia_seg
    H = int(T/hor_seg)
    T = T % hor_seg
    M = int(T/min_seg)
    T = T % min_seg
    S = T

print('{} dia(s)\n{} hora(s)\n{} minuto(s)\n{} segundo(s)'.format(d,H,M,S))

