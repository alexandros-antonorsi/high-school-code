file = open("nocow.in", "r")
out = open("nocow.out", "w")
line = file.readline().split(" ")
n = int(line[0])
k = int(line[1])
line = file.readline()
line = (line[(line.find("no")+3):].split(" "))[:-1]
adj = [[] for i in range(0, len(line))]
for x in range(0, len(line)):
    adj[x].append(line[x])
for x in range(1, n):
    line = file.readline()
    line = (line[(line.find("no")+3):].split(" "))[:-1]
    if line[x] not in adj[x]:
        adj[x].append(line[x])

print(adj)
