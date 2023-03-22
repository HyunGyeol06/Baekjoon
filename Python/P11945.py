pang = []

n, m = map(int, input().split())

i=0

while i<n:
    pang.append(input())
    i+=1

i=0
while i<n:
    print(pang[i][::-1])
    i+=1


