t = int(input())
for z in range(0,t):
    seq = (input().split(" "))[:-1]
    imports = 0
    seq[0] = int(seq[0])
    for x in range(1,len(seq)):
        seq[x] = int(seq[x])
        if seq[x] > 2*seq[x-1]:
            imports += (seq[x]-2*seq[x-1])
    print(imports)