file = open("badmilk.in", "r")
out = open("badmilk.out", "w")
line = file.readline().split(" ")
n = int(line[0])
m = int(line[1])
d = int(line[2])
s = int(line[3])
log = [[]]*d
for x in range(0,d):
    log[x] = file.readline().split(" ")
sick = [[]]*s
sickmilk = [False]*m
for x in range(0,s):
    sick[x] = file.readline().split(" ")
p = int(sick[0][0])
t = int(sick[0][1])
for a in range(0,d):
    if int(log[a][0]) == p and int(log[a][2]) <= t:
        sickmilk[a] = True
thisSick = [False]*m
for x in range(1,s):
    p = int(sick[x][0])
    t = int(sick[x][1])
    for y in range(0,d):
        person = int(log[y][0])
        milk = int(log[y][1])
        time = int(log[y][2])
        if person==p and time<=t:
            thisSick[milk-1] = True
    for y in range(0,m):
        sickmilk[y] = sickmilk[y] and thisSick[y]
sickMilkList = []
for x in range(0,m):
    if sickmilk[x]:
        sickMilkList.append(x)
pplSick = [False]*d
for x in range(0,d):
    person = int(log[x][0])
    milk = int(log[x][1])
    if milk in sickMilkList:
        pplSick[person-1] = True
counter =0
for x in range(0,d):
    if pplSick[x]:
        counter+=1
out.write(str(counter))
out.close()
file.close()
