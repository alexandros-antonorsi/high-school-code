file = open("paint.in", "r")
out = open("paint.out", "w")
a=0
b=0
c=0
d=0
l1 = file.readline().split(" ")
l2 = file.readline().split(" ")
a = int(l1[0])
b = int(l1[1])
c = int(l2[0])
d = int(l2[1])
m = max(a,max(b,max(c,d)))
line = [False]*m
for x in range(a,b):
    line[x] = True
for x in range(c,d):
    line[x] = True
count = 0
for x in range(0,m):
    if line[x]:
        count +=1
out.write(str(count))
out.close()
file.close()